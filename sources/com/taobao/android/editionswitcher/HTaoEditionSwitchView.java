package com.taobao.android.editionswitcher;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.schedule.ViewProxy;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import tb.cqv;
import tb.kbq;
import tb.m78;
import tb.o78;
import tb.pzb;
import tb.r5a;
import tb.t2o;
import tb.uza;
import tb.x78;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HTaoEditionSwitchView extends EditionSwitchView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View allChangeCountryLayout;
    private View allChooseCountryLayout;
    private CountDownTimer countDownTimer;
    private TextView countryNameTextView;
    private EditionListAdapter listAdapter;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends CountDownTimer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Integer[] f7602a;
        public final /* synthetic */ TextView b;
        public final /* synthetic */ String c;
        public final /* synthetic */ PositionInfo d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, long j2, Integer[] numArr, TextView textView, String str, PositionInfo positionInfo) {
            super(j, j2);
            this.f7602a = numArr;
            this.b = textView;
            this.c = str;
            this.d = positionInfo;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/HTaoEditionSwitchView$1");
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            HTaoEditionSwitchView hTaoEditionSwitchView = HTaoEditionSwitchView.this;
            hTaoEditionSwitchView.processLocationChanged(hTaoEditionSwitchView.getContext(), this.d.countryCode, true);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
                return;
            }
            Integer[] numArr = this.f7602a;
            numArr[0] = Integer.valueOf(numArr[0].intValue() - 1000);
            this.b.setText(String.format(this.c, Integer.valueOf(this.f7602a[0].intValue() / 1000), this.d.countryName));
        }
    }

    static {
        t2o.a(729808905);
    }

    public HTaoEditionSwitchView(Context context, int i, pzb pzbVar) {
        super(context, i, pzbVar);
        init(context);
    }

    private void addClickEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39f447a", new Object[]{this});
        } else {
            r5a.i("Page_Home", 2101, "Page_Home_Click-qiezhanPop_old", "spm=a2141.1.qiezhanPop_old");
        }
    }

    public static void commitEvent(String str, int i, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684218b7", new Object[]{str, new Integer(i), str2, str3, str4, str5});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, str2, str3, str4, str5);
            cqv.u(str, str2 + "_BehaviX_UT", null, null, str5);
        } catch (Exception unused) {
        }
    }

    private void commitExposureEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f99e4063", new Object[]{this});
        } else {
            r5a.i("Page_Home", 2201, "Page_Home_Show-qiezhanPop_old", "spm=a2141.1.qiezhanPop_old");
        }
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.homepage_area_switch_htao_dialog, this);
        this.allChangeCountryLayout = findViewById(R.id.all_change_country_layout);
        this.allChooseCountryLayout = findViewById(R.id.country_list_layout);
        this.countryNameTextView = (TextView) findViewById(R.id.textView_current_country);
        ViewProxy.setOnClickListener(findViewById(R.id.btn_change_country_confirm), this);
        if (this.viewType == 0) {
            this.allChangeCountryLayout.setVisibility(0);
            this.allChooseCountryLayout.setVisibility(8);
            initCurrentArea();
            if (kbq.h(context)) {
                commitExposureEvent();
                return;
            }
            return;
        }
        this.allChangeCountryLayout.setVisibility(8);
        this.allChooseCountryLayout.setVisibility(0);
        loadAllAreas();
    }

    private void initCurrentArea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d86ffd", new Object[]{this});
            return;
        }
        PositionInfo a2 = kbq.a(getContext());
        this.countryNameTextView.setText(a2.countryName);
        this.countryNameTextView.setTag(a2.countryCode);
        HImageView hImageView = (HImageView) findViewById(R.id.iv_change_country_reason);
        if (!TextUtils.isEmpty(a2.ext.hTaoContentImg)) {
            if ("KR".equals(a2.countryCode) || "GLOBAL".equals(a2.countryCode)) {
                hImageView.setPlaceHoldForeground(getResources().getDrawable(R.drawable.homepage_area_switch_service_kr_global));
            } else {
                hImageView.setPlaceHoldForeground(getResources().getDrawable(R.drawable.homepage_area_switch_service_other));
            }
        }
        hImageView.setImageUrl(a2.ext.hTaoContentImg);
        ((TextView) findViewById(R.id.textView_change_country_hint)).setText(String.format(getResources().getString(R.string.area_switch_htao_change_hint), a2.countryName));
        processSwitchEdition(a2);
    }

    public static /* synthetic */ Object ipc$super(HTaoEditionSwitchView hTaoEditionSwitchView, String str, Object... objArr) {
        if (str.hashCode() == -893949262) {
            super.onDismiss();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/HTaoEditionSwitchView");
    }

    private void loadAllAreas() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e26e72", new Object[]{this});
            return;
        }
        Context context = getContext();
        ((TextView) findViewById(R.id.tv_confirm)).setText(R.string.area_switch_btn_name_confirm_choose);
        ListView listView = (ListView) findViewById(R.id.listView_countries);
        LinkedHashMap<String, PositionInfo> d = x78.d();
        ArrayList arrayList = new ArrayList();
        for (String str3 : d.keySet()) {
            if (!TextUtils.equals(str3, "CUN") && !TextUtils.equals(str3, "OLD")) {
                arrayList.add(str3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        PositionInfo c = kbq.c(context);
        if (this.countryNameTextView.getTag() == null) {
            str = "";
        } else {
            str = this.countryNameTextView.getTag().toString();
        }
        if (TextUtils.isEmpty(str)) {
            if (c == null) {
                str = o78.CHINA_MAINLAND;
            } else {
                str = c.countryCode;
            }
        }
        PositionInfo a2 = kbq.a(context);
        if (a2 == null) {
            str2 = o78.CHINA_MAINLAND;
        } else {
            str2 = a2.countryCode;
        }
        int[] d2 = uza.d((String[]) arrayList.toArray(new String[0]), str, str2);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < d2.length; i2++) {
            m78 m78Var = new m78();
            String trim = ((String) arrayList.get(d2[i2])).trim();
            m78Var.f23817a = trim;
            m78Var.b = d.get(trim).countryName.trim();
            if (TextUtils.equals(m78Var.f23817a, str)) {
                m78Var.c = true;
                z = true;
            } else {
                m78Var.c = false;
            }
            if (TextUtils.equals(m78Var.f23817a, o78.CHINA_MAINLAND)) {
                i = i2;
            }
            arrayList2.add(m78Var);
        }
        if (!z) {
            ((m78) arrayList2.get(i)).c = true;
        }
        EditionListAdapter editionListAdapter = new EditionListAdapter(arrayList2);
        this.listAdapter = editionListAdapter;
        listView.setAdapter((ListAdapter) editionListAdapter);
        listView.setOnItemClickListener(this.listAdapter);
    }

    private void processSwitchEdition(PositionInfo positionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39b59fa5", new Object[]{this, positionInfo});
            return;
        }
        OvsPopExt ovsPopExt = positionInfo.ovsPopExt;
        TextView textView = (TextView) findViewById(R.id.tv_confirm);
        int i = ovsPopExt.ovsRemindKind;
        this.remindKind = i;
        if (i != 1) {
            textView.setText(String.format(getResources().getString(R.string.area_switch_btn_name_confirm_change), positionInfo.countryName));
            return;
        }
        Integer[] numArr = {Integer.valueOf((ovsPopExt.ovsRemindCountDown * 1000) + 1000)};
        String string = getResources().getString(R.string.area_switch_btn_name_confirm_change_countdown);
        textView.setText(String.format(string, Integer.valueOf(numArr[0].intValue() / 1000), positionInfo.countryName));
        a aVar = new a(numArr[0].intValue(), 1000L, numArr, textView, string, positionInfo);
        this.countDownTimer = aVar;
        aVar.start();
    }

    @Override // com.taobao.android.editionswitcher.EditionSwitchView, android.view.View.OnClickListener
    public void onClick(View view) {
        EditionListAdapter editionListAdapter;
        m78 checkedAreaItem;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.change_country_layout) {
            this.allChangeCountryLayout.setVisibility(8);
            this.allChooseCountryLayout.setVisibility(0);
            this.viewType = 1;
            loadAllAreas();
            traceShowEvent();
        } else if (id == R.id.btn_change_country_confirm) {
            int i = this.viewType;
            if (i == 0) {
                if (kbq.h(getContext())) {
                    addClickEvent();
                }
                if (this.countryNameTextView.getTag() == null) {
                    str = o78.CHINA_MAINLAND;
                } else {
                    str = (String) this.countryNameTextView.getTag();
                }
                processLocationChanged(view.getContext(), str, false);
            } else if (i == 1 && (editionListAdapter = this.listAdapter) != null && (checkedAreaItem = editionListAdapter.getCheckedAreaItem()) != null) {
                processLocationChanged(view.getContext(), checkedAreaItem.f23817a, false);
            }
        }
    }

    @Override // com.taobao.android.editionswitcher.EditionSwitchView
    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            return;
        }
        super.onDismiss();
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public HTaoEditionSwitchView(Context context, AttributeSet attributeSet, int i, pzb pzbVar) {
        super(context, i, pzbVar);
        init(context);
    }

    public HTaoEditionSwitchView(Context context, AttributeSet attributeSet, int i, int i2, pzb pzbVar) {
        super(context, i2, pzbVar);
        init(context);
    }
}
