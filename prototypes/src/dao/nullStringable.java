package dao;

public interface nullStringable {
	/**
	 * @param String str
	 * @return a null pointer if str null, if not null return 'str'
	 */
	public default String nullStringFormat(String str) {
		
		if(str == null) {
			return null;
		}
		
		return "'" + str + "'";
	}
}
