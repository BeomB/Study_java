package Paymethod;

import java.util.TreeMap;

public class MappingDto {

    private TreeMap<String,String> localMap = new TreeMap<>();
    private TreeMap<String,String> globalMap = new TreeMap<>();


    public TreeMap<String, String> getLocalMap() {
        return localMap;
    }

    public TreeMap<String, String> getGlobalMap() {
        return globalMap;
    }


    public void setLocalMap(TreeMap<String, String> localMap) {
        this.localMap = localMap;
    }

    public void setGlobalMap(TreeMap<String, String> globalMap) {
        this.globalMap = globalMap;
    }

    @Override
    public String toString() {
        return localMap.toString() + globalMap.toString();
    }

}
