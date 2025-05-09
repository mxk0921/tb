package com.android.taobao.safeclean;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CleanList implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String appVersion = "";
    public List<CleanModel> cleanDataList = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class CleanModel implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int dataId = 0;
        public String type = "internal";
        public int strategy = 0;
        public String fileRoot = "";
        public String fileLocation = "";
        public String extension = "";
        public String exclude = "";

        static {
            t2o.a(654311433);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CleanModel)) {
                return false;
            }
            CleanModel cleanModel = (CleanModel) obj;
            if (this.dataId != cleanModel.dataId || !this.type.equals(cleanModel.type) || this.strategy != cleanModel.strategy || !this.fileRoot.equals(cleanModel.fileRoot) || !this.fileLocation.equals(cleanModel.fileLocation) || !this.extension.equals(cleanModel.extension) || !this.exclude.equals(cleanModel.exclude)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2 = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            for (Object obj : Arrays.asList(Integer.valueOf(this.dataId), this.type, Integer.valueOf(this.strategy), this.fileRoot, this.fileLocation, this.extension, this.exclude)) {
                int i3 = i2 * 31;
                if (obj == null) {
                    i = 0;
                } else {
                    i = obj.hashCode();
                }
                i2 = i3 + i;
            }
            return i2;
        }
    }

    static {
        t2o.a(654311432);
    }

    private boolean collectionsEqual(List<CleanModel> list, List<CleanModel> list2) {
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
        if (!(obj instanceof CleanList)) {
            return false;
        }
        CleanList cleanList = (CleanList) obj;
        if (!this.appVersion.equals(cleanList.appVersion) || !collectionsEqual(this.cleanDataList, cleanList.cleanDataList)) {
            return false;
        }
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CleanList{appVersion='" + this.appVersion + "', cleanDataList=" + this.cleanDataList + '}';
    }
}
