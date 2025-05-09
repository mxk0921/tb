package com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.lifecycle;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.view.View;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class AbsLocalBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            } else {
                AbsLocalBroadcastReceiver.this.b();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            } else {
                AbsLocalBroadcastReceiver.this.c();
            }
        }
    }

    static {
        t2o.a(491782167);
    }

    public AbsLocalBroadcastReceiver(View view) {
        view.addOnAttachStateChangeListener(new a());
    }

    public static /* synthetic */ Object ipc$super(AbsLocalBroadcastReceiver absLocalBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/render/dinamicx/dx3/view/video/lifecycle/AbsLocalBroadcastReceiver");
    }

    public abstract IntentFilter a();

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(this, a());
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(this);
        }
    }
}
