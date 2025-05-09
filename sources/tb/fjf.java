package tb;

import android.view.View;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.toolchain.InternalDetectActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fjf implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InternalDetectActivity f19340a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                InternalDetectActivity.n3(fjf.this.f19340a);
            }
        }
    }

    public fjf(InternalDetectActivity internalDetectActivity) {
        this.f19340a = internalDetectActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        InternalDetectActivity.l3(this.f19340a).setText("");
        InternalDetectActivity.m3(this.f19340a).setText("");
        ThreadPoolExecutorFactory.submitDetectTask(new a());
    }
}
