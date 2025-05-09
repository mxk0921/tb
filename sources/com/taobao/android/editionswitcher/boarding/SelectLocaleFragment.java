package com.taobao.android.editionswitcher.boarding;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.boarding.LocaleModel;
import com.taobao.android.editionswitcher.boarding.PopWindowView;
import com.taobao.schedule.ViewProxy;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import java.util.List;
import mtopsdk.common.util.StringUtils;
import tb.ljb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SelectLocaleFragment extends Fragment implements View.OnClickListener, com.taobao.android.editionswitcher.boarding.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TextView f7620a;
    public TextView c;
    public TextView d;
    public TextView e;
    public Button f;
    public ViewGroup g;
    public c h;
    public ljb i;
    public AlertDialog j;
    public LocaleModel.PromoteText k = new LocaleModel.PromoteText();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements PopWindowView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.editionswitcher.boarding.PopWindowView.c
        public void a(LocaleModel.LocaleData localeData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fbb2132", new Object[]{this, localeData});
                return;
            }
            SelectLocaleFragment.p2(SelectLocaleFragment.this).b(localeData);
            TBS.Ext.commitEvent("Page_LocalBoarding", 2101, "editionSelect", null, null, "selectedEdition=" + localeData.key);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements PopWindowView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.editionswitcher.boarding.PopWindowView.c
        public void a(LocaleModel.LocaleData localeData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fbb2132", new Object[]{this, localeData});
                return;
            }
            SelectLocaleFragment.p2(SelectLocaleFragment.this).a(localeData);
            TBS.Ext.commitEvent("Page_LocalBoarding", 2101, "langSelect", null, null, "selectedLang=" + localeData.key);
        }
    }

    static {
        t2o.a(456130649);
        t2o.a(456130630);
    }

    public static /* synthetic */ Object ipc$super(SelectLocaleFragment selectLocaleFragment, String str, Object... objArr) {
        if (str.hashCode() == -1589549411) {
            super.onAttach((Context) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/boarding/SelectLocaleFragment");
    }

    public static /* synthetic */ c p2(SelectLocaleFragment selectLocaleFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("4a5d8b12", new Object[]{selectLocaleFragment});
        }
        return selectLocaleFragment.h;
    }

    @Override // com.taobao.android.editionswitcher.boarding.b
    public void W(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1987ab56", new Object[]{this, str, str2});
            return;
        }
        this.c.setText(str);
        this.d.setText(str2);
    }

    @Override // com.taobao.android.editionswitcher.boarding.b
    public void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8443e2c", new Object[]{this});
            return;
        }
        ljb ljbVar = this.i;
        if (ljbVar != null) {
            ljbVar.onLocaleSetDone();
        }
    }

    @Override // com.taobao.android.editionswitcher.boarding.b
    public void b1(LocaleModel.PromoteText promoteText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b06d330", new Object[]{this, promoteText});
        } else if (promoteText != null) {
            this.k = promoteText;
            if (StringUtils.isNotBlank(promoteText.selectText)) {
                this.f7620a.setText(promoteText.selectText);
            }
            if (StringUtils.isNotBlank(promoteText.bottomTips)) {
                this.e.setText(promoteText.bottomTips);
            }
            if (StringUtils.isNotBlank(promoteText.bottomButton)) {
                this.f.setText(promoteText.bottomButton);
            }
        }
    }

    @Override // com.taobao.android.editionswitcher.boarding.b
    public void hideLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
            return;
        }
        AlertDialog alertDialog = this.j;
        if (alertDialog != null) {
            alertDialog.hide();
        }
    }

    @Override // com.taobao.android.editionswitcher.boarding.b
    public void m1(boolean z) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9507a6d4", new Object[]{this, new Boolean(z)});
            return;
        }
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (z) {
            view = LayoutInflater.from(this.g.getContext()).inflate(R.layout.ovs_layout_select_locale_ru, this.g, false);
            this.h = new d(this, z);
            ((d) this.h).k((RecyclerView) view.findViewById(R.id.locale_list_ru));
            ViewProxy.setOnClickListener(view.findViewById(R.id.ovs_confirm_ru_btn), this);
        } else {
            view = LayoutInflater.from(this.g.getContext()).inflate(R.layout.ovs_layout_select_locale, this.g, false);
            this.f7620a = (TextView) view.findViewById(R.id.ovs_select_tips);
            this.e = (TextView) view.findViewById(R.id.ovs_bottom_tips);
            this.c = (TextView) view.findViewById(R.id.ovs_locale_country_tx);
            this.d = (TextView) view.findViewById(R.id.ovs_locale_lang_tx);
            ViewProxy.setOnClickListener(view.findViewById(R.id.ovs_country_btn), this);
            ViewProxy.setOnClickListener(view.findViewById(R.id.ovs_lang_btn), this);
            Button button = (Button) view.findViewById(R.id.ovs_confirm_btn);
            this.f = button;
            button.setOnClickListener(this);
            this.h = new d(this, z);
        }
        this.g.addView(view);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        if (getActivity() instanceof ljb) {
            this.i = (ljb) getActivity();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.ovs_country_btn) {
            r2();
        } else if (id == R.id.ovs_lang_btn) {
            s2();
        } else if (id == R.id.ovs_confirm_btn) {
            ((d) this.h).e(false);
        } else if (id == R.id.ovs_confirm_ru_btn) {
            ((d) this.h).e(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        this.g = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        m1(d.i);
        return this.g;
    }

    public final void r2() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e47a3f", new Object[]{this});
            return;
        }
        LocaleModel.LocaleData g = ((d) this.h).g();
        StringBuilder sb = new StringBuilder("selectedEdition=");
        List<LocaleModel.LocaleData> f = ((d) this.h).f();
        sb.append(g.key);
        sb.append(",supportEdition=");
        for (LocaleModel.LocaleData localeData : f) {
            sb.append(localeData.key);
            sb.append(",");
        }
        PopWindowView c = PopWindowView.c(getActivity(), ((d) this.h).f());
        if (StringUtils.isBlank(this.k.chooseCountryTItle)) {
            str = getString(R.string.ovs_locale_title_country);
        } else {
            str = this.k.chooseCountryTItle;
        }
        PopWindowView h = c.h(str);
        StringBuilder sb2 = new StringBuilder();
        if (StringUtils.isBlank(this.k.chooseCountrySubTitle)) {
            str2 = getString(R.string.ovs_locale_chosen_country);
        } else {
            str2 = this.k.chooseCountrySubTitle;
        }
        sb2.append(str2);
        sb2.append(((d) this.h).g().value);
        h.g(sb2.toString()).b(new a()).i(getActivity());
        TBS.Ext.commitEvent("Page_LocalBoarding", 2201, "editionPopShow", null, null, sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r3 != false) goto L_0x002f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s2() {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.editionswitcher.boarding.SelectLocaleFragment.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "ae64414d"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r7
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0012:
            com.taobao.android.editionswitcher.boarding.c r0 = r7.h
            com.taobao.android.editionswitcher.boarding.d r0 = (com.taobao.android.editionswitcher.boarding.d) r0
            com.taobao.android.editionswitcher.boarding.LocaleModel$LocaleData r0 = r0.h()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.taobao.android.editionswitcher.boarding.c r2 = r7.h
            com.taobao.android.editionswitcher.boarding.d r2 = (com.taobao.android.editionswitcher.boarding.d) r2
            java.util.List r2 = r2.i()
            if (r2 == 0) goto L_0x002f
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0037
        L_0x002f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r0)
        L_0x0037:
            java.lang.String r3 = "selectedLang="
            r1.append(r3)
            java.lang.String r0 = r0.key
            r1.append(r0)
            java.lang.String r0 = ",supportLang="
            r1.append(r0)
            java.util.Iterator r0 = r2.iterator()
        L_0x004b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r0.next()
            com.taobao.android.editionswitcher.boarding.LocaleModel$LocaleData r3 = (com.taobao.android.editionswitcher.boarding.LocaleModel.LocaleData) r3
            java.lang.String r3 = r3.key
            r1.append(r3)
            java.lang.String r3 = ","
            r1.append(r3)
            goto L_0x004b
        L_0x0062:
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
            com.taobao.android.editionswitcher.boarding.PopWindowView r0 = com.taobao.android.editionswitcher.boarding.PopWindowView.c(r0, r2)
            com.taobao.android.editionswitcher.boarding.LocaleModel$PromoteText r2 = r7.k
            java.lang.String r2 = r2.chooseLangTitle
            boolean r2 = mtopsdk.common.util.StringUtils.isBlank(r2)
            if (r2 == 0) goto L_0x007b
            int r2 = com.taobao.taobao.R.string.ovs_locale_title_lang
            java.lang.String r2 = r7.getString(r2)
            goto L_0x007f
        L_0x007b:
            com.taobao.android.editionswitcher.boarding.LocaleModel$PromoteText r2 = r7.k
            java.lang.String r2 = r2.chooseLangTitle
        L_0x007f:
            com.taobao.android.editionswitcher.boarding.PopWindowView r0 = r0.h(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.taobao.android.editionswitcher.boarding.LocaleModel$PromoteText r3 = r7.k
            java.lang.String r3 = r3.chooseLangSubTitle
            boolean r3 = mtopsdk.common.util.StringUtils.isBlank(r3)
            if (r3 == 0) goto L_0x0099
            int r3 = com.taobao.taobao.R.string.ovs_locale_chosen_lang
            java.lang.String r3 = r7.getString(r3)
            goto L_0x009d
        L_0x0099:
            com.taobao.android.editionswitcher.boarding.LocaleModel$PromoteText r3 = r7.k
            java.lang.String r3 = r3.chooseLangSubTitle
        L_0x009d:
            r2.append(r3)
            com.taobao.android.editionswitcher.boarding.c r3 = r7.h
            com.taobao.android.editionswitcher.boarding.d r3 = (com.taobao.android.editionswitcher.boarding.d) r3
            com.taobao.android.editionswitcher.boarding.LocaleModel$LocaleData r3 = r3.g()
            java.lang.String r3 = r3.value
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.taobao.android.editionswitcher.boarding.PopWindowView r0 = r0.g(r2)
            com.taobao.android.editionswitcher.boarding.SelectLocaleFragment$b r2 = new com.taobao.android.editionswitcher.boarding.SelectLocaleFragment$b
            r2.<init>()
            com.taobao.android.editionswitcher.boarding.PopWindowView r0 = r0.b(r2)
            androidx.fragment.app.FragmentActivity r2 = r7.getActivity()
            r0.i(r2)
            java.lang.String r0 = r1.toString()
            java.lang.String[] r6 = new java.lang.String[]{r0}
            r4 = 0
            r5 = 0
            java.lang.String r1 = "Page_LocalBoarding"
            r2 = 2201(0x899, float:3.084E-42)
            java.lang.String r3 = "langPopShow"
            com.taobao.statistic.TBS.Ext.commitEvent(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.editionswitcher.boarding.SelectLocaleFragment.s2():void");
    }

    @Override // com.taobao.android.editionswitcher.boarding.b
    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        if (this.j == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), R.style.OvsLoadingDialog);
            builder.setView(LayoutInflater.from(getActivity()).inflate(R.layout.ovs_locale_loading, (ViewGroup) null));
            AlertDialog create = builder.create();
            this.j = create;
            create.setCancelable(false);
        }
        this.j.show();
    }
}
