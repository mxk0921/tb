package com.alibaba.ariver.resource.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DynamicPluginInfo implements Parcelable {
    public static final Parcelable.Creator<DynamicPluginInfo> CREATOR = new Parcelable.Creator<DynamicPluginInfo>() { // from class: com.alibaba.ariver.resource.api.models.DynamicPluginInfo.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DynamicPluginInfo createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DynamicPluginInfo) ipChange.ipc$dispatch("92c7c2c0", new Object[]{this, parcel}) : new DynamicPluginInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DynamicPluginInfo[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DynamicPluginInfo[]) ipChange.ipc$dispatch("8d9c8869", new Object[]{this, new Integer(i)}) : new DynamicPluginInfo[i];
        }
    };
    private List<PluginModel> pluginModels;

    public DynamicPluginInfo() {
        this.pluginModels = new ArrayList();
    }

    public boolean addPlugin(PluginModel pluginModel) {
        PluginModel pluginModel2;
        if (pluginModel == null) {
            return false;
        }
        Iterator<PluginModel> it = this.pluginModels.iterator();
        while (true) {
            if (!it.hasNext()) {
                pluginModel2 = null;
                break;
            }
            pluginModel2 = it.next();
            if (TextUtils.equals(pluginModel.getAppId(), pluginModel2.getAppId()) && TextUtils.equals(pluginModel.getVersion(), pluginModel2.getVersion())) {
                break;
            }
        }
        if (pluginModel2 != null) {
            this.pluginModels.remove(pluginModel2);
        }
        return this.pluginModels.add(pluginModel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<PluginModel> getPluginModels() {
        return this.pluginModels;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.pluginModels);
    }

    public DynamicPluginInfo(Parcel parcel) {
        this.pluginModels = new ArrayList();
        this.pluginModels = parcel.createTypedArrayList(PluginModel.CREATOR);
    }
}
