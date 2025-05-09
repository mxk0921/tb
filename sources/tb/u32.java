package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.basement.BasementViewController;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class u32 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final a f29102a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<BasementViewController> f29103a;

        static {
            t2o.a(745537576);
        }

        public a(BasementViewController basementViewController) {
            this.f29103a = new WeakReference<>(basementViewController);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/basement/BasementPreloadManager$PreloadHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            BasementViewController basementViewController = this.f29103a.get();
            if (basementViewController != null && message.what == 2) {
                if (!basementViewController.I(0) && u32.b() < 5) {
                    sendEmptyMessageDelayed(2, 500L);
                }
                if (u32.a() > 5) {
                    basementViewController.O();
                }
            }
        }
    }

    static {
        t2o.a(745537575);
    }

    public u32(BasementViewController basementViewController, Context context) {
        this.f29102a = new a(basementViewController);
    }

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue();
        }
        return b;
    }

    public static /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd46c372", new Object[0])).intValue();
        }
        int i = b;
        b = i + 1;
        return i;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        a aVar = this.f29102a;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca458796", new Object[]{this});
        } else {
            this.f29102a.sendEmptyMessage(2);
        }
    }
}
