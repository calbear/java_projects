

public class LowArrayApp {

	public static void main(String[] args) {
		LowArray arr;
		arr = new LowArray(3);
		int nElems = 0;
		int j, k;

		arr.setElem(0, 77);
		arr.setElem(1, 99);
		arr.setElem(2, 55);
		// insert more elements
		
		for(j=0; j<nElems; j++) {
			System.out.println(arr.getElem(j) + " ");
			System.out.println(" ");
		}
		
		int searchKey = 55;
		for(j=0; j<nElems; j++){
			if(arr.getElem(j) == searchKey)
				break;
			
			if(j == nElems)
				System.out.println("Can't find " + searchKey);
			else
				System.out.println("Found " + searchKey);
		}
		
		//-------------------------------
		for(j=0; j<nElems; j++) {
			if(arr.getElem(j) == 55)
				break;
			
			for(k=0; k<nElems; k++) {
				arr.setElem(k, arr.getElem(k+1));
				nElems--;
			}
		}
		
		//---------display items------------
		for(j=0; j<nElems; j++) {
			System.out.print(arr.getElem(j) + " ");
			System.out.println(" ");
		}

	}

}
