package com.taobao.android.preview;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXCheckBoxEvent;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.s;
import com.taobao.android.preview.DXTemplatePreviewActivity;
import tb.k06;
import tb.ob5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DXPreviewInterfaceImpl implements DXTemplatePreviewActivity.DXPreviewInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends ob5 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(DXPreviewInterfaceImpl dXPreviewInterfaceImpl, s sVar) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/preview/DXPreviewInterfaceImpl$1");
        }

        @Override // tb.ob5, tb.mvb
        public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
                return;
            }
            if (dXEvent instanceof DXCheckBoxEvent) {
                ((DXCheckBoxEvent) dXEvent).isChecked();
            }
            String obj = objArr != null ? objArr.toString() : null;
            Context j = s.j();
            Toast.makeText(j, "收到点击 参数为: " + obj, 0).show();
        }
    }

    static {
        t2o.a(444598031);
        t2o.a(444598042);
    }

    @Override // com.taobao.android.preview.DXTemplatePreviewActivity.DXPreviewInterface
    public void previewEngineDidInitialized(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe99d8e", new Object[]{this, sVar});
            return;
        }
        Log.e("shandian", "反射调用previewEngineDidInitialized");
        sVar.s(k06.a("test"), new a(this, sVar));
    }
}
