package com.taobao.android.stdpop.api.viewpager;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.b;
import com.taobao.themis.external.embed.StartParams;
import com.taobao.themis.external.embed.TMSEmbed;
import tb.a07;
import tb.abl;
import tb.ckf;
import tb.mpl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class PanelBuildFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public TMSEmbed f9492a;
    public StartParams c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(786432035);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final Fragment a(mpl mplVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("fb0af541", new Object[]{this, mplVar});
            }
            ckf.g(mplVar, "info");
            PanelBuildFragment panelBuildFragment = new PanelBuildFragment();
            Bundle bundle = new Bundle();
            if (b.d().b(mplVar.d())) {
                bundle.putBoolean("isWeex", true);
            } else {
                bundle.putBoolean("isWeex", false);
            }
            bundle.putString("url", mplVar.d());
            bundle.putSerializable("content", mplVar.a());
            panelBuildFragment.setArguments(bundle);
            return panelBuildFragment;
        }
    }

    static {
        t2o.a(786432034);
    }

    public static /* synthetic */ Object ipc$super(PanelBuildFragment panelBuildFragment, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/stdpop/api/viewpager/PanelBuildFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (abl.o()) {
            TMSEmbed tMSEmbed = this.f9492a;
            if (tMSEmbed != null) {
                tMSEmbed.d();
            }
            this.f9492a = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.stdpop.api.viewpager.PanelBuildFragment.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001e
            java.lang.String r2 = "bcd5231c"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r0 = 1
            r3[r0] = r5
            r5 = 2
            r3[r5] = r6
            r5 = 3
            r3[r5] = r7
            java.lang.Object r5 = r1.ipc$dispatch(r2, r3)
            android.view.View r5 = (android.view.View) r5
            return r5
        L_0x001e:
            java.lang.String r7 = "inflater"
            tb.ckf.g(r5, r7)
            int r7 = com.taobao.taobao.R.layout.std_fragment_container
            android.view.View r5 = r5.inflate(r7, r6, r0)
            if (r5 == 0) goto L_0x00ba
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            android.os.Bundle r6 = r4.getArguments()
            if (r6 == 0) goto L_0x003a
            java.lang.String r7 = "isWeex"
            boolean r0 = r6.getBoolean(r7)
        L_0x003a:
            r6 = 0
            if (r0 == 0) goto L_0x006e
            com.taobao.themis.external.embed.Weex2StartParams r7 = new com.taobao.themis.external.embed.Weex2StartParams
            r7.<init>()
            android.os.Bundle r0 = r4.getArguments()
            if (r0 == 0) goto L_0x004f
            java.lang.String r1 = "content"
            java.io.Serializable r0 = r0.getSerializable(r1)
            goto L_0x0050
        L_0x004f:
            r0 = r6
        L_0x0050:
            boolean r1 = r0 instanceof com.alibaba.fastjson.JSONObject
            if (r1 != 0) goto L_0x0055
            r0 = r6
        L_0x0055:
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            r7.setInitData(r0)
            tb.xhv r0 = tb.xhv.INSTANCE
            r4.c = r7
            androidx.fragment.app.FragmentActivity r7 = r4.getActivity()
            if (r7 == 0) goto L_0x006c
            com.taobao.themis.external.embed.TMSEmbed r0 = new com.taobao.themis.external.embed.TMSEmbed
            com.taobao.themis.external.embed.TMSEmbedSolutionType r1 = com.taobao.themis.external.embed.TMSEmbedSolutionType.WEEX
            r0.<init>(r7, r1)
            goto L_0x0082
        L_0x006c:
            r0 = r6
            goto L_0x0082
        L_0x006e:
            com.taobao.themis.external.embed.WebStartParams r7 = new com.taobao.themis.external.embed.WebStartParams
            r7.<init>()
            r4.c = r7
            androidx.fragment.app.FragmentActivity r7 = r4.getActivity()
            if (r7 == 0) goto L_0x006c
            com.taobao.themis.external.embed.TMSEmbed r0 = new com.taobao.themis.external.embed.TMSEmbed
            com.taobao.themis.external.embed.TMSEmbedSolutionType r1 = com.taobao.themis.external.embed.TMSEmbedSolutionType.WEB_SINGLE_PAGE
            r0.<init>(r7, r1)
        L_0x0082:
            r4.f9492a = r0
            android.os.Bundle r7 = r4.getArguments()
            if (r7 == 0) goto L_0x009a
            java.lang.String r0 = "url"
            java.lang.String r7 = r7.getString(r0)
            if (r7 == 0) goto L_0x009a
            com.taobao.themis.external.embed.StartParams r0 = r4.c
            if (r0 == 0) goto L_0x009a
            r0.setUrl(r7)
        L_0x009a:
            com.taobao.themis.external.embed.StartParams r7 = r4.c
            if (r7 == 0) goto L_0x00a5
            com.taobao.themis.external.embed.TMSEmbed r0 = r4.f9492a
            if (r0 == 0) goto L_0x00a5
            r0.i(r7)
        L_0x00a5:
            com.taobao.themis.external.embed.TMSEmbed r7 = r4.f9492a
            if (r7 == 0) goto L_0x00ad
            android.view.View r6 = r7.h()
        L_0x00ad:
            com.taobao.themis.external.embed.TMSEmbed r7 = r4.f9492a
            if (r7 == 0) goto L_0x00b4
            r7.u()
        L_0x00b4:
            if (r6 == 0) goto L_0x00b9
            r5.addView(r6)
        L_0x00b9:
            return r5
        L_0x00ba:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type android.widget.FrameLayout"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.stdpop.api.viewpager.PanelBuildFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
