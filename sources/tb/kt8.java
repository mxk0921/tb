package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.bbn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class kt8 implements bbn.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bbn.b f22904a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ abn f22905a;

        public a(abn abnVar) {
            this.f22905a = abnVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(ngd.ARGS_LIB_NAME, this.f22905a.d());
            if (this.f22905a.g()) {
                hashMap.put(ngd.ARGS_EXTRACT_COMPRESSED_PATH, this.f22905a.a());
                hashMap.put(ngd.ARGS_EXTRACT_EXTRACTED_PATH, this.f22905a.e());
                hashMap.putAll(this.f22905a.f().b());
                rbn.j(ngd.POINT_EXTRACT, hashMap);
                return;
            }
            rbn.h(ngd.POINT_EXTRACT, hashMap, this.f22905a.b());
        }
    }

    public kt8(bbn.b bVar) {
        this.f22904a = bVar;
    }

    @Override // tb.bbn.b
    public void a(abn abnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7319aaaa", new Object[]{this, abnVar});
            return;
        }
        rbn.i("extract-tracker", new a(abnVar));
        bbn.b bVar = this.f22904a;
        if (bVar != null) {
            bVar.a(abnVar);
        }
    }
}
