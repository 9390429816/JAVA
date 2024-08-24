		import java.io.FileInputStream;
		import java.io.FileOutputStream;
		import java.util.Properties;

		public class pro 
		{

			public static void main(String[] args) throws Exception
			{
				// TODO Auto-generated method stub
		       Properties p=new Properties();
		      FileInputStream fis=new FileInputStream("C:\JavaPro");
			   p.load(fis);
			   System.out.println(p.getProperty("username"));
			   System.out.println(p.getProperty("Password"));
			   FileOutputStream fos=new fileOutputStream("C:\JavaPro");
			   p.store(fos,  "done by Manoj");
			   fis.close();
			}

		}
