package ratingsystem;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserAccount {
		@Id
		@GeneratedValue
		private long userID;
		private String username;
		
		public UserAccount()
		{
			this.userID = 1;
			this.username = "gabby";
		}
		public long getUserID() {
			return userID;
		}
		private void setUserID(long userID) {
			this.userID = userID;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		@Override
		public boolean equals(Object o) {
			if(o != null && o instanceof UserAccount) {
				return ((UserAccount)o).getUserID() == this.getUserID();
			}
			return false;
		}
		
		@Override
		public int hashCode() {
			return (int)this.getUserID();
		}
	}
