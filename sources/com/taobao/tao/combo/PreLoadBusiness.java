package com.taobao.tao.combo;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.combo.dataobject.ComboData;
import com.taobao.tao.combo.dataobject.ComboResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.request.BasicRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.n24;
import tb.t2o;
import tb.x32;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PreLoadBusiness extends x32 implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long mSellerId;

    static {
        t2o.a(764412048);
        t2o.a(589299719);
    }

    public PreLoadBusiness(Application application, long j) {
        super(application);
        this.mSellerId = j;
        setRemoteBaseListener(this);
    }

    public static /* synthetic */ Object ipc$super(PreLoadBusiness preLoadBusiness, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/combo/PreLoadBusiness");
    }

    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
        } else {
            super.destroy();
        }
    }

    public long getSellerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c5a7eeb", new Object[]{this})).longValue();
        }
        return this.mSellerId;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        ComboResponse comboResponse;
        ComboData data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (baseOutDo != null && (baseOutDo instanceof ComboResponse) && (data = (comboResponse = (ComboResponse) baseOutDo).getData()) != null) {
            n24.c().d(Long.valueOf(data.mealId), comboResponse);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        }
    }

    public void setSellerId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1cc3d21", new Object[]{this, new Long(j)});
        } else {
            this.mSellerId = j;
        }
    }

    public void startRequest(ArrayList<Long> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ca7c56", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList.size() >= 1) {
            Iterator<Long> it = arrayList.iterator();
            while (it.hasNext()) {
                startRequest(it.next().longValue());
            }
        }
    }

    private void startRequest(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b516770", new Object[]{this, new Long(j)});
        } else if (n24.c().b(Long.valueOf(j)) == null) {
            BasicRequest basicRequest = new BasicRequest();
            basicRequest.setAPI_NAME("mtop.gebsupport.shop.getMeal");
            basicRequest.setNEED_ECODE(false);
            basicRequest.setNEED_SESSION(true);
            basicRequest.setORIGINALJSON(true);
            basicRequest.setSid(Login.getSid());
            basicRequest.setVERSION("2.0");
            HashMap hashMap = new HashMap();
            hashMap.put("sellerId", Long.valueOf(this.mSellerId));
            hashMap.put("mealId", Long.valueOf(j));
            hashMap.put("needMealIdList", Boolean.FALSE);
            startRequest(null, 0, basicRequest, ComboResponse.class, hashMap);
        }
    }
}
