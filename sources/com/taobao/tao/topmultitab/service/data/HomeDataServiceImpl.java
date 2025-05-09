package com.taobao.tao.topmultitab.service.data;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.cfc;
import tb.cs2;
import tb.hqk;
import tb.imn;
import tb.kba;
import tb.rtk;
import tb.rvk;
import tb.t2o;
import tb.vs8;
import tb.wcc;
import tb.xcc;
import tb.z9c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HomeDataServiceImpl implements IHomeDataService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HomeDataService";
    private cs2 mCacheDataValidator;
    private vs8 mExternalDataProcessor;
    private final List<hqk> mDataProcessListenerList = new CopyOnWriteArrayList();
    private final List<rvk> mUiRefreshListenerList = new CopyOnWriteArrayList();
    private final List<rtk> mRequestListenerList = new CopyOnWriteArrayList();

    static {
        t2o.a(729810175);
        t2o.a(729810176);
    }

    @Override // com.taobao.tao.topmultitab.service.data.IHomeDataService
    public void addDataProcessListener(hqk hqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f3c7b5", new Object[]{this, hqkVar});
        } else {
            this.mDataProcessListenerList.add(hqkVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.data.IHomeDataService
    public void addOnRequestListener(rtk rtkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("992006e0", new Object[]{this, rtkVar});
        } else {
            this.mRequestListenerList.add(rtkVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.data.IHomeDataService
    public void addOnUiRefreshListener(rvk rvkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af8a1f0", new Object[]{this, rvkVar});
        } else {
            this.mUiRefreshListenerList.add(rvkVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.data.IHomeDataService
    public Object getExternalDataByKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ce22285a", new Object[]{this, str, str2});
        }
        return this.mExternalDataProcessor.d(str, str2);
    }

    @Override // com.taobao.tao.topmultitab.service.data.IHomeDataService
    public z9c getGlobalExtModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z9c) ipChange.ipc$dispatch("532d2c9e", new Object[]{this});
        }
        return kba.a();
    }

    public void notifyDataProcessFinish(JSONObject jSONObject, IContainerDataModel<?> iContainerDataModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c22beb", new Object[]{this, jSONObject, iContainerDataModel, str});
        } else if (!this.mDataProcessListenerList.isEmpty()) {
            for (hqk hqkVar : this.mDataProcessListenerList) {
                hqkVar.a(jSONObject, iContainerDataModel, str);
            }
        }
    }

    public void notifyDataProcessStart(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af7230ad", new Object[]{this, jSONObject, str});
        } else if (!this.mDataProcessListenerList.isEmpty()) {
            for (hqk hqkVar : this.mDataProcessListenerList) {
                hqkVar.b(jSONObject, str);
            }
        }
    }

    public void notifyRequestFailure(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ff08b9", new Object[]{this, jSONObject, str, str2});
        } else if (!this.mRequestListenerList.isEmpty()) {
            for (rtk rtkVar : this.mRequestListenerList) {
                rtkVar.a(jSONObject, str, str2);
            }
        }
    }

    public void notifyRequestStart(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac267cd", new Object[]{this, jSONObject});
        } else if (!this.mRequestListenerList.isEmpty()) {
            for (rtk rtkVar : this.mRequestListenerList) {
                rtkVar.c(jSONObject);
            }
        }
    }

    public void notifyRequestSuccess(JSONObject jSONObject, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2228dc8", new Object[]{this, jSONObject, awesomeGetContainerData});
        } else if (!this.mRequestListenerList.isEmpty()) {
            for (rtk rtkVar : this.mRequestListenerList) {
                rtkVar.b(jSONObject, awesomeGetContainerData);
            }
        }
    }

    public void notifyUiRefreshFinish(imn imnVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c971d8", new Object[]{this, imnVar, jSONObject, str});
        } else if (!this.mUiRefreshListenerList.isEmpty()) {
            for (rvk rvkVar : this.mUiRefreshListenerList) {
                rvkVar.b(imnVar, jSONObject, str);
            }
        }
    }

    public void notifyUiRefreshStart(imn imnVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8313ba5", new Object[]{this, imnVar, jSONObject, str});
        } else if (!this.mUiRefreshListenerList.isEmpty()) {
            for (rvk rvkVar : this.mUiRefreshListenerList) {
                rvkVar.a(imnVar, jSONObject, str);
            }
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        cs2 cs2Var = this.mCacheDataValidator;
        if (cs2Var != null) {
            cs2Var.c();
        }
        this.mExternalDataProcessor.c();
    }

    @Override // com.taobao.tao.topmultitab.service.data.IHomeDataService
    public void removeDataProcessListener(hqk hqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd05358", new Object[]{this, hqkVar});
        } else {
            this.mDataProcessListenerList.remove(hqkVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.data.IHomeDataService
    public void removeOnRequestListener(rtk rtkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24aac8c3", new Object[]{this, rtkVar});
        } else {
            this.mRequestListenerList.remove(rtkVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.data.IHomeDataService
    public void removeOnUiRefreshListener(rvk rvkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db9ba53", new Object[]{this, rvkVar});
        } else {
            this.mUiRefreshListenerList.remove(rvkVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
            return;
        }
        cs2 cs2Var = new cs2(wccVar);
        this.mCacheDataValidator = cs2Var;
        cs2Var.d();
        this.mExternalDataProcessor = new vs8(wccVar);
    }
}
