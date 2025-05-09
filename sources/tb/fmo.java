package tb;

import android.app.Activity;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.onesearch.SearchWidgetUCWebView;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fmo extends phw<Void, FrameLayout, b64> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SearchWidgetUCWebView f19409a;
    public d6p b;
    public final ipw c;
    public boolean d = false;

    static {
        t2o.a(815793711);
    }

    public fmo(Activity activity, ude udeVar, b64 b64Var, ViewGroup viewGroup, vfw vfwVar, ipw ipwVar) {
        super(activity, udeVar, b64Var, viewGroup, vfwVar);
        this.c = ipwVar;
        ensureView();
        subscribeEvent(this);
    }

    public static /* synthetic */ Object ipc$super(fmo fmoVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode == 299066517) {
            super.onCtxPause();
            return null;
        } else if (hashCode == 593843865) {
            super.onCtxDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/widgets/onesearch/SFUCWebViewWidget");
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "SFUCWebViewWidget";
    }

    @Override // tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
        } else if (this.f19409a != null) {
            removeFromContainer();
            ((FrameLayout) getView()).removeAllViews();
            this.f19409a.destroy();
        }
    }

    @Override // tb.abx
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        onComponentDestroy();
    }

    @Override // tb.abx
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        SearchWidgetUCWebView searchWidgetUCWebView = this.f19409a;
        if (searchWidgetUCWebView != null) {
            searchWidgetUCWebView.onPause();
        }
    }

    @Override // tb.abx
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        SearchWidgetUCWebView searchWidgetUCWebView = this.f19409a;
        if (searchWidgetUCWebView != null) {
            searchWidgetUCWebView.onResume();
        }
    }

    public void onEventMainThread(fml fmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7dbb382", new Object[]{this, fmlVar});
            return;
        }
        SearchWidgetUCWebView searchWidgetUCWebView = this.f19409a;
        if (searchWidgetUCWebView != null) {
            searchWidgetUCWebView.onActivityResult(fmlVar.f19408a, fmlVar.b, fmlVar.c);
        }
    }

    public void q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858dee8e", new Object[]{this});
            return;
        }
        SearchWidgetUCWebView searchWidgetUCWebView = this.f19409a;
        if (searchWidgetUCWebView != null) {
            searchWidgetUCWebView.clearHistory();
        }
    }

    public void s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b346219", new Object[]{this});
            return;
        }
        SearchWidgetUCWebView searchWidgetUCWebView = this.f19409a;
        if (searchWidgetUCWebView != null) {
            searchWidgetUCWebView.loadUrl("about:blank");
        }
    }

    public WVUCWebView t2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("151ffdcd", new Object[]{this});
        }
        SearchWidgetUCWebView searchWidgetUCWebView = this.f19409a;
        if (searchWidgetUCWebView != null) {
            return searchWidgetUCWebView;
        }
        return null;
    }

    public String u2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f71bb66", new Object[]{this, str});
        }
        if (this.f19409a == null) {
            x2();
        }
        if (TextUtils.equals(f6p.h(str, "_xDisableInterception"), slo.VALUE_YES)) {
            b4p.g("SFUCWebViewWidget", "_xDisableInterception=YES");
            this.f19409a.setIntercept(false);
        } else {
            this.f19409a.setIntercept(true);
        }
        this.f19409a.loadUrl(str);
        b4p.a("SFUCWebViewWidget", "load with web view, url:" + str);
        return this.f19409a.getUrl();
    }

    public void v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f667768", new Object[]{this});
        } else {
            this.d = true;
        }
    }

    /* renamed from: w2 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getActivity());
        frameLayout.setId(kgw.a());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public final void x2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd85d7f5", new Object[]{this});
            return;
        }
        SearchWidgetUCWebView searchWidgetUCWebView = new SearchWidgetUCWebView(getActivity());
        this.f19409a = searchWidgetUCWebView;
        ipw ipwVar = this.c;
        if (ipwVar != null) {
            searchWidgetUCWebView.setTag(R.id.tbsearch_webview_action_performer, ipwVar);
        }
        if (this.d) {
            this.f19409a.setWidget(this);
        }
        this.f19409a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        d6p d6pVar = this.b;
        if (d6pVar != null) {
            this.f19409a.setFilter(d6pVar);
        }
        ((FrameLayout) getView()).addView(this.f19409a);
    }

    public void y2(d6p d6pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e3e7221", new Object[]{this, d6pVar});
            return;
        }
        SearchWidgetUCWebView searchWidgetUCWebView = this.f19409a;
        if (searchWidgetUCWebView != null) {
            searchWidgetUCWebView.setFilter(d6pVar);
        }
        this.b = d6pVar;
    }

    public void z2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3290be", new Object[]{this, new Integer(i)});
        } else if (getView() != 0) {
            ((FrameLayout) getView()).getLayoutParams().height = i;
            ((FrameLayout) getView()).requestLayout();
        }
    }
}
