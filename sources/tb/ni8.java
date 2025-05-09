package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.j;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import java.util.Map;
import tb.lgs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ni8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements TNodeView.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f24747a;

        public a(c cVar) {
            this.f24747a = cVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.k
        public void F2(lgs.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1535162a", new Object[]{this, bVar});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.l
        public void onLayoutCompleted(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e800489", new Object[]{this, nVar});
                return;
            }
            tfs.d("errorPage url render complete");
            nVar.P().U0(new d(this.f24747a));
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.l
        public void onLayoutError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("834776a6", new Object[]{this});
            } else {
                tfs.d("errorPage url render error");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f24748a;

        public b(c cVar) {
            this.f24748a = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            c cVar = this.f24748a;
            if (cVar != null) {
                cVar.onRetry();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void onRetry();
    }

    static {
        t2o.a(503317362);
    }

    public static View a(Context context, String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a3b17d88", new Object[]{context, str, cVar});
        }
        TBErrorView A = s6o.A(context);
        A.setButton(TBErrorView.ButtonType.BUTTON_LEFT, wmc.REFRESH, new b(cVar));
        Error newError = Error.Factory.newError(null, null);
        newError.url = str;
        A.setError(newError);
        return A;
    }

    public static View b(Context context, String str, String str2, String str3, String str4, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d95a94d5", new Object[]{context, str, str2, str3, str4, cVar});
        }
        if (TextUtils.isEmpty(str4) || !akt.n1()) {
            return a(context, str, cVar);
        }
        try {
            Uri.Builder buildUpon = Uri.parse(str4).buildUpon();
            if (!TextUtils.isEmpty(str2)) {
                buildUpon.appendQueryParameter("code", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                buildUpon.appendQueryParameter("msg", str3);
            }
            return TNodeView.create(context, null, null, buildUpon.build().toString(), null, null, new a(cVar));
        } catch (Exception e) {
            tfs.d("errorPage url parse error:" + e.getMessage());
            return a(context, str, cVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d implements j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final c f24749a;

        static {
            t2o.a(503317366);
            t2o.a(503317092);
        }

        public d(c cVar) {
            this.f24749a = cVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.j
        public boolean onHandleMessage(n.g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1e782cf4", new Object[]{this, gVar})).booleanValue();
            }
            return onHandleTNodeMessage(gVar.b, gVar.c, gVar.d, null, gVar.e, gVar.g);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.j
        public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
            }
            if (!"onretry".equals(str)) {
                return false;
            }
            c cVar = this.f24749a;
            if (cVar != null) {
                cVar.onRetry();
            }
            return true;
        }
    }
}
