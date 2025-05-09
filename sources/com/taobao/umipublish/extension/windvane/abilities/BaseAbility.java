package com.taobao.umipublish.extension.windvane.abilities;

import android.content.Context;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.odg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class BaseAbility implements Serializable, IAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context mContext;
    public Listener mListener;
    private boolean mCanCallback = true;
    public final int MAX_PROGRESS = 100;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface Listener {
        void a(String str, String str2);

        void onProgress(int i);

        void onSuccess(JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class SimpleListener implements Listener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(944767148);
            t2o.a(944767147);
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
            }
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
        public void onProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
            }
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
            }
        }
    }

    static {
        t2o.a(944767146);
        t2o.a(944767153);
    }

    public void errorCallback(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97e05f88", new Object[]{this, str, str2});
        } else if (this.mCanCallback) {
            Listener listener = this.mListener;
            if (listener != null) {
                listener.a(str, str2);
            }
            this.mCanCallback = false;
            odg.c("BaseAbility", "errCode=" + str + ", errMsg=" + str2);
        }
    }

    public final void execute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a0a0f4", new Object[]{this, jSONObject});
            return;
        }
        try {
            onExecute(jSONObject);
        } catch (Throwable th) {
            errorCallback("-1", Log.getStackTraceString(th));
        }
    }

    public abstract void onExecute(JSONObject jSONObject);

    public void progressCallback(int i) {
        Listener listener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc3e10a", new Object[]{this, new Integer(i)});
        } else if (this.mCanCallback && (listener = this.mListener) != null) {
            listener.onProgress(i);
        }
    }

    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.mContext = context;
        }
    }

    public void setListener(Listener listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2449cac7", new Object[]{this, listener});
        } else {
            this.mListener = listener;
        }
    }

    public void successCallback(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd6d2e1", new Object[]{this, jSONObject});
        } else if (this.mCanCallback) {
            Listener listener = this.mListener;
            if (listener != null) {
                listener.onProgress(100);
                this.mListener.onSuccess(jSONObject);
            }
            this.mCanCallback = false;
        }
    }
}
