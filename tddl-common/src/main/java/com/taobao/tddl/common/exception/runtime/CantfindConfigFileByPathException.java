/*(C) 2007-2012 Alibaba Group Holding Limited.	

public class CantfindConfigFileByPathException extends TDLRunTimeException{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3338684575935778495L;
	public CantfindConfigFileByPathException(String path) {
		super("�޷�����path:"+path+"�ҵ�ָ����xml�ļ�");
	}
}