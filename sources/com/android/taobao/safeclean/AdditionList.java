package com.android.taobao.safeclean;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AdditionList implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String appVersion = "";
    public List<AdditionModel> additionDataList = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class AdditionModel implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String type = "internal";
        public String fileRoot = "";
        public String fileLocation = "";
        public String fileName = "";
        public boolean overrideExit = false;
        public String fileUrl = "";
        public String fileMD5 = "";
        public String fileSize = "";

        static {
            t2o.a(654311428);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AdditionModel additionModel = (AdditionModel) obj;
            String str = this.type;
            if (str == null ? additionModel.type != null : !str.equals(additionModel.type)) {
                return false;
            }
            String str2 = this.fileRoot;
            if (str2 == null ? additionModel.fileRoot != null : !str2.equals(additionModel.fileRoot)) {
                return false;
            }
            String str3 = this.fileLocation;
            if (str3 == null ? additionModel.fileLocation != null : !str3.equals(additionModel.fileLocation)) {
                return false;
            }
            String str4 = this.fileUrl;
            if (str4 == null ? additionModel.fileUrl != null : !str4.equals(additionModel.fileUrl)) {
                return false;
            }
            String str5 = this.fileMD5;
            if (str5 == null ? additionModel.fileMD5 != null : !str5.equals(additionModel.fileMD5)) {
                return false;
            }
            String str6 = this.fileSize;
            String str7 = additionModel.fileSize;
            if (str6 != null) {
                return str6.equals(str7);
            }
            if (str7 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.type;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i7 = i * 31;
            String str2 = this.fileRoot;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (i7 + i2) * 31;
            String str3 = this.fileLocation;
            if (str3 != null) {
                i3 = str3.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 31;
            String str4 = this.fileUrl;
            if (str4 != null) {
                i4 = str4.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 31;
            String str5 = this.fileMD5;
            if (str5 != null) {
                i5 = str5.hashCode();
            } else {
                i5 = 0;
            }
            int i11 = (i10 + i5) * 31;
            String str6 = this.fileSize;
            if (str6 != null) {
                i6 = str6.hashCode();
            }
            return i11 + i6;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "AdditionModel{type='" + this.type + "', fileRoot='" + this.fileRoot + "', fileLocation='" + this.fileLocation + "', fileName='" + this.fileName + "', overrideExit=" + this.overrideExit + ", fileUrl='" + this.fileUrl + "', fileMD5='" + this.fileMD5 + "', fileSize='" + this.fileSize + "'}";
        }
    }

    static {
        t2o.a(654311427);
    }

    private boolean collectionsEqual(List<AdditionModel> list, List<AdditionModel> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8fca38c", new Object[]{this, list, list2})).booleanValue();
        }
        if (list.size() != list2.size()) {
            return false;
        }
        return list.containsAll(list2);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionList)) {
            return false;
        }
        AdditionList additionList = (AdditionList) obj;
        if (!this.appVersion.equals(((CleanList) obj).appVersion) || !collectionsEqual(this.additionDataList, additionList.additionDataList)) {
            return false;
        }
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AdditionList{appVersion='" + this.appVersion + "', additionDataList=" + this.additionDataList + '}';
    }
}
