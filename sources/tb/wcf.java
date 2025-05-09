package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.framework.UpdateRuntime;
import java.util.concurrent.CountDownLatch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wcf implements npv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f30612a = false;
    public final CountDownLatch b = new CountDownLatch(1);

    static {
        t2o.a(952107010);
        t2o.a(946864139);
    }

    public static boolean waitForConfirmAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2536377", new Object[]{str})).booleanValue();
        }
        wcf wcfVar = new wcf();
        UpdateRuntime.doUIAlertForConfirm(str, wcfVar);
        try {
            wcfVar.b.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return wcfVar.f30612a;
    }

    @Override // tb.npv
    public String getCancelText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("338a645c", new Object[]{this});
        }
        return wmc.CANCEL;
    }

    @Override // tb.npv
    public String getConfirmText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f0d2482", new Object[]{this});
        }
        return wmc.CONFIRM;
    }

    @Override // tb.npv
    public String getTitleText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4800096a", new Object[]{this});
        }
        return wmc.TIPS;
    }

    @Override // tb.npv
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return "INSTANT_PATCH";
    }

    @Override // tb.npv
    public void onCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379d4540", new Object[]{this});
            return;
        }
        this.f30612a = false;
        this.b.countDown();
    }

    @Override // tb.npv
    public void onConfirm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("310393e8", new Object[]{this});
            return;
        }
        this.f30612a = true;
        this.b.countDown();
    }
}
