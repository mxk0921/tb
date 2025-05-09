package tb;

import com.alibaba.marvel.java.OnProgressListener;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x6w implements OnProgressListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u6w f31185a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f31186a;

        public a(float f) {
            this.f31186a = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator it = u6w.O0(x6w.this.f31185a).iterator();
            while (it.hasNext()) {
                tdd tddVar = (tdd) it.next();
                if (tddVar != null) {
                    tddVar.a(this.f31186a);
                }
            }
        }
    }

    public x6w(u6w u6wVar) {
        this.f31185a = u6wVar;
    }

    public void onProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec8ea6d", new Object[]{this, new Float(f)});
        } else if (u6w.O0(this.f31185a).size() > 0) {
            u6w.P0(this.f31185a).post(new a(f));
        }
    }
}
