package com.taobao.android.editionswitcher.homepage;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.OvsPopExt;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import tb.l78;
import tb.o78;
import tb.ozb;
import tb.t2o;
import tb.tza;
import tb.x78;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HTaoEditionSwitchView extends EditionSwitchView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private CountDownTimer countDownTimer;
    private View mAllChangeCountryLayout;
    private View mAllChooseCountryLayout;
    private TextView mCountryNameTextView;
    private EditionListAdapter mListAdapter;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends CountDownTimer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Integer[] f7638a;
        public final /* synthetic */ TextView b;
        public final /* synthetic */ String c;
        public final /* synthetic */ PositionInfo d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, long j2, Integer[] numArr, TextView textView, String str, PositionInfo positionInfo) {
            super(j, j2);
            this.f7638a = numArr;
            this.b = textView;
            this.c = str;
            this.d = positionInfo;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/homepage/HTaoEditionSwitchView$1");
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
            Integer[] numArr = this.f7638a;
            numArr[0] = Integer.valueOf(numArr[0].intValue() - 1000);
            this.b.setText(String.format(this.c, Integer.valueOf(this.f7638a[0].intValue() / 1000), this.d.countryName));
        }
    }

    static {
        t2o.a(456130680);
    }

    public HTaoEditionSwitchView(Context context, int i, ozb ozbVar) {
        super(context, i, ozbVar);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.homepage_area_switch_htao_dialog, this);
        this.mAllChangeCountryLayout = findViewById(R.id.all_change_country_layout);
        this.mAllChooseCountryLayout = findViewById(R.id.country_list_layout);
        this.mCountryNameTextView = (TextView) findViewById(R.id.textView_current_country);
        ViewProxy.setOnClickListener(findViewById(R.id.btn_change_country_confirm), this);
        if (this.mViewType == 0) {
            this.mAllChangeCountryLayout.setVisibility(0);
            this.mAllChooseCountryLayout.setVisibility(8);
            initCurrentArea();
            return;
        }
        this.mAllChangeCountryLayout.setVisibility(8);
        this.mAllChooseCountryLayout.setVisibility(0);
        loadAllAreas();
    }

    private void initCurrentArea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d86ffd", new Object[]{this});
            return;
        }
        PositionInfo f = o78.f(getContext());
        this.mCountryNameTextView.setText(f.countryName);
        this.mCountryNameTextView.setTag(f.countryCode);
        HImageView hImageView = (HImageView) findViewById(R.id.iv_change_country_reason);
        if (!TextUtils.isEmpty(f.ext.hTaoContentImg)) {
            hImageView.setPlaceHoldForeground(getResources().getDrawable(R.drawable.area_switch_service_other));
        }
        hImageView.setImageUrl(f.ext.hTaoContentImg);
        ((TextView) findViewById(R.id.textView_change_country_hint)).setText(String.format(getResources().getString(R.string.area_switch_htao_change_hint), f.countryName));
        processSwitchEdition(f);
    }

    public static /* synthetic */ Object ipc$super(HTaoEditionSwitchView hTaoEditionSwitchView, String str, Object... objArr) {
        if (str.hashCode() == -893949262) {
            super.onDismiss();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/homepage/HTaoEditionSwitchView");
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
        PositionInfo i = o78.i(context);
        if (this.mCountryNameTextView.getTag() == null) {
            str = "";
        } else {
            str = this.mCountryNameTextView.getTag().toString();
        }
        if (TextUtils.isEmpty(str)) {
            if (i == null) {
                str = o78.CHINA_MAINLAND;
            } else {
                str = i.countryCode;
            }
        }
        PositionInfo f = o78.f(context);
        if (f == null) {
            str2 = o78.CHINA_MAINLAND;
        } else {
            str2 = f.countryCode;
        }
        int[] i2 = tza.i((String[]) arrayList.toArray(new String[0]), str, str2);
        boolean z = false;
        int i3 = 0;
        for (int i4 = 0; i4 < i2.length; i4++) {
            l78 l78Var = new l78();
            String trim = ((String) arrayList.get(i2[i4])).trim();
            l78Var.f23148a = trim;
            l78Var.b = d.get(trim).countryName.trim();
            if (TextUtils.equals(l78Var.f23148a, str)) {
                l78Var.d = true;
                z = true;
            } else {
                l78Var.d = false;
            }
            if (TextUtils.equals(l78Var.f23148a, o78.CHINA_MAINLAND)) {
                i3 = i4;
            }
            arrayList2.add(l78Var);
        }
        if (!z) {
            ((l78) arrayList2.get(i3)).d = true;
        }
        EditionListAdapter editionListAdapter = new EditionListAdapter(arrayList2);
        this.mListAdapter = editionListAdapter;
        listView.setAdapter((ListAdapter) editionListAdapter);
        listView.setOnItemClickListener(this.mListAdapter);
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

    @Override // com.taobao.android.editionswitcher.homepage.EditionSwitchView, android.view.View.OnClickListener
    public void onClick(View view) {
        EditionListAdapter editionListAdapter;
        l78 checkedAreaItem;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.change_country_layout) {
            this.mAllChangeCountryLayout.setVisibility(8);
            this.mAllChooseCountryLayout.setVisibility(0);
            this.mViewType = 1;
            loadAllAreas();
            traceShowEvent();
        } else if (id == R.id.btn_change_country_confirm) {
            int i = this.mViewType;
            if (i == 0) {
                if (this.mCountryNameTextView.getTag() == null) {
                    str = o78.CHINA_MAINLAND;
                } else {
                    str = (String) this.mCountryNameTextView.getTag();
                }
                processLocationChanged(view.getContext(), str, false);
            } else if (i == 1 && (editionListAdapter = this.mListAdapter) != null && (checkedAreaItem = editionListAdapter.getCheckedAreaItem()) != null) {
                processLocationChanged(view.getContext(), checkedAreaItem.f23148a, false);
            }
        }
    }

    @Override // com.taobao.android.editionswitcher.homepage.EditionSwitchView
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
}
