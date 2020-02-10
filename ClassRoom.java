package assignment03;

import java.util.List;
import java.util.ArrayList;
//import java.util.Arrays;
public class ClassRoom {
	List<Student> roster = new ArrayList<>();

	public List<Student> getRoster() {
		return roster;
	}

	public void addStudent(Student s) {
		roster.add(s);
	}

	public void dropStudent(int id) {
		int position=-1;
		for(int i=0;i<roster.size();i++) {
			Student s = roster.get(i);
			if(s.getId()!=id) {
				position=-1;
			}
			if(s.getId()==id) {
				position=i;
				if(position>=0) {
					roster.remove(i);
				}
			}
		}
	}
	public String toString(){
		return roster.toString();
	}
	public static void sortById(List<Student> list) {
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				Student s = list.get(j);
				Student x = list.get(i);
				if(s.getId() >  x.getId()) {
					Student temp1 = list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp1);
				}
			}
		}
	}
	public void sortById() {
		for(int i=0;i<roster.size();i++) {
			for(int j=i+1;j<roster.size();j++) {
				Student s = roster.get(j);
				Student x = roster.get(i);
				if(s.getId() >  x.getId()) {
					Student temp1 = roster.get(i);
					roster.set(i,roster.get(j));
					roster.set(j,temp1);
				}
			}
		}
	}

	public boolean isRegistered(int id) {
		for(int i=0; i<roster.size(); i++) {
			Student x = roster.get(i);
			if(x.getId() == id) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	public List<Student> alsoRegisteredIn(ClassRoom... theot){		//Don't get why this doesn't work...
		if(theot == null || theot.length ==0) {
			return roster;
		}
		List<Student> returnList = new ArrayList<Student>();
		for(int i=0; i < theot.length; i++) {
			for(int j=0; j < roster.size(); j++) {
				List<Student> x = theot[i].getRoster();
				for(int k=0;k<x.size();k++) {
					if( x.get(k)==roster.get(j)) {
						returnList.add(roster.get(j));
					}
				}
			}
		}
		return returnList;
	}

	public static List<Student> registeredInAll(ClassRoom... theot){
		List<Student> returnList = new ArrayList<Student>();
		if(theot == null || theot.length==0) {

			return returnList;
		}
		for (ClassRoom other : theot) {
			returnList.addAll(other.getRoster()) ;
		}
		return returnList;
	}
	public static List<Student> registeredInOne(ClassRoom... theot){
		List<Student> returnList = new ArrayList<Student>();

		if(theot == null || theot.length==0) {

			return returnList;
		}
		for(int i=0; i<theot.length;i++) {
			List<Student> x = theot[i].getRoster();
			for(int j=0; j< x.size();j++) {
				Student student = x.get(j);
				if(!(returnList.contains(student))) {
					returnList.add(student);
				}
			}
		}
		return returnList;
	}
}
