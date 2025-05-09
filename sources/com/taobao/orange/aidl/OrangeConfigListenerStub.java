package com.taobao.orange.aidl;

import android.os.RemoteException;
import com.taobao.orange.aidl.ParcelableConfigListener;
import java.util.HashMap;
import java.util.Map;
import tb.mbk;
import tb.obk;
import tb.t2o;
import tb.y8l;
import tb.z8l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class OrangeConfigListenerStub extends ParcelableConfigListener.Stub {
    private boolean append;
    private mbk mListener;

    static {
        t2o.a(613417041);
    }

    public OrangeConfigListenerStub(mbk mbkVar) {
        this.append = true;
        this.mListener = mbkVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mListener.equals(((OrangeConfigListenerStub) obj).mListener);
    }

    public int hashCode() {
        return this.mListener.hashCode();
    }

    public boolean isAppend() {
        return this.append;
    }

    @Override // com.taobao.orange.aidl.ParcelableConfigListener
    public void onConfigUpdate(String str, Map map) throws RemoteException {
        mbk mbkVar = this.mListener;
        if (mbkVar instanceof y8l) {
            ((y8l) mbkVar).onConfigUpdate(str);
        } else if (mbkVar instanceof z8l) {
            ((z8l) this.mListener).onConfigUpdate(str, Boolean.parseBoolean((String) ((HashMap) map).get("fromCache")));
        } else if (mbkVar instanceof obk) {
            ((obk) mbkVar).onConfigUpdate(str, (HashMap) map);
        }
    }

    public OrangeConfigListenerStub(mbk mbkVar, boolean z) {
        this.append = z;
        this.mListener = mbkVar;
    }
}
