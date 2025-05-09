package com.taobao.android.ultronx.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultronx.base.CPointer;
import java.lang.ref.WeakReference;
import tb.m5e;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class InnerUltronEngineCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public m5e mCallback;
    public WeakReference<UltronEngine> mEngineRef;
    public Handler mHandler = new a(Looper.getMainLooper());
    public CPointer mPointer;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultronx/engine/InnerUltronEngineCallback$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            InnerUltronEngineCallback.this.getClass();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        static {
            t2o.a(939524103);
        }
    }

    static {
        t2o.a(939524101);
    }

    public InnerUltronEngineCallback(UltronEngine ultronEngine) {
        this.mEngineRef = new WeakReference<>(ultronEngine);
    }

    public void _innerParseFailed(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7c7ae8", new Object[]{this, new Boolean(z), str, str2});
            return;
        }
        b bVar = new b();
        Message obtain = Message.obtain();
        obtain.obj = bVar;
        this.mHandler.sendMessage(obtain);
    }

    public void _innerParseSuccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("752f8ac6", new Object[]{this, new Boolean(z)});
            return;
        }
        b bVar = new b();
        Message obtain = Message.obtain();
        obtain.obj = bVar;
        this.mHandler.sendMessage(obtain);
    }
}
