package com.taobao.android.detail.alicom.widget;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.adapter.PhonenumCityAdapter;
import com.taobao.android.detail.alicom.adapter.PhonenumNetworkAdapter;
import com.taobao.android.detail.alicom.adapter.PhonenumNumberAdapter;
import com.taobao.android.detail.alicom.adapter.PhonenumPlanAdapter;
import com.taobao.android.detail.alicom.model.ContractCityInfo;
import com.taobao.android.detail.alicom.model.ContractSelectedRet;
import com.taobao.android.detail.alicom.model.FetchComponentData$FetchModel;
import com.taobao.android.detail.alicom.model.network.PreholdingPhoneNumberData;
import com.taobao.android.detail.alicom.model.network.PreholdingPhoneNumberResult;
import com.taobao.android.detail.alicom.model.network.QueryContractPhoneNumberData;
import com.taobao.android.detail.alicom.model.network.QueryContractPhoneNumberResult;
import com.taobao.android.detail.alicom.mtop.RemoteBusinessListener;
import com.taobao.android.detail.alicom.view.PhonenumSideBar;
import com.taobao.android.detail.kit.view.widget.base.uikit.view.TBCircularProgress;
import com.taobao.android.detail.sdk.model.node.ContractNode;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import com.taobao.trtc.api.TrtcConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.ct2;
import tb.dsq;
import tb.gr4;
import tb.kxn;
import tb.rul;
import tb.t2o;
import tb.v14;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PhoneNumSalePlanView extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String A;
    public ContractCityInfo B;
    public FetchComponentData$FetchModel.ComponentData.Plan C;
    public FetchComponentData$FetchModel.ComponentData.Network D;
    public String E;
    public List<FetchComponentData$FetchModel.ComponentData.Plan> F;
    public List<FetchComponentData$FetchModel.ComponentData.Network> G;
    public RemoteBusiness H;
    public RemoteBusinessListener I;
    public boolean J = false;
    public final boolean K;
    public final gr4 L;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f6531a;
    public RelativeLayout b;
    public RelativeLayout c;
    public RelativeLayout d;
    public RelativeLayout e;
    public TextView f;
    public TextView g;
    public TextView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public TextView m;
    public Button n;
    public ImageView o;
    public TextView p;
    public View q;
    public TBCircularProgress r;
    public final FetchComponentData$FetchModel.ComponentData s;
    public final ContractSelectedRet t;
    public final ContractNode.Version u;
    public List<ContractCityInfo> v;
    public List<FetchComponentData$FetchModel.ComponentData.Network> w;
    public List<FetchComponentData$FetchModel.ComponentData.Plan> x;
    public List<String> y;
    public final String z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class SelectCityDialog extends Dialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Activity f6532a;
        public TextView b;
        public ListView c;
        public TextView d;
        public PhonenumSideBar e;
        public ImageView f;
        public PhonenumCityAdapter g;
        public final List<ContractCityInfo> h;
        public final List<String> i;
        public final int j;
        public final String k;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (view.getId() == R.id.detail_phonenumber_area_back_iv) {
                    SelectCityDialog.this.dismiss();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements PhonenumSideBar.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            public void a(String str) {
                int positionForSection;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("80ae351d", new Object[]{this, str});
                } else if (SelectCityDialog.a(SelectCityDialog.this) != null && !TextUtils.isEmpty(str) && (positionForSection = SelectCityDialog.a(SelectCityDialog.this).getPositionForSection(str.charAt(0))) != -1) {
                    SelectCityDialog.b(SelectCityDialog.this).setSelection(positionForSection);
                }
            }
        }

        static {
            t2o.a(703594534);
        }

        public SelectCityDialog(Activity activity, String str, List<ContractCityInfo> list, List<String> list2, ContractCityInfo contractCityInfo) {
            super(activity, 16973840);
            this.j = -1;
            this.f6532a = activity;
            this.h = list;
            this.i = list2;
            this.j = c(contractCityInfo);
            this.k = str;
        }

        public static /* synthetic */ PhonenumCityAdapter a(SelectCityDialog selectCityDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PhonenumCityAdapter) ipChange.ipc$dispatch("2386185e", new Object[]{selectCityDialog});
            }
            return selectCityDialog.g;
        }

        public static /* synthetic */ ListView b(SelectCityDialog selectCityDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ListView) ipChange.ipc$dispatch("d42d859e", new Object[]{selectCityDialog});
            }
            return selectCityDialog.c;
        }

        public static /* synthetic */ Object ipc$super(SelectCityDialog selectCityDialog, String str, Object... objArr) {
            if (str.hashCode() == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/alicom/widget/PhoneNumSalePlanView$SelectCityDialog");
        }

        public final int c(ContractCityInfo contractCityInfo) {
            FetchComponentData$FetchModel.ComponentData.Area.City city;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("242fc963", new Object[]{this, contractCityInfo})).intValue();
            }
            if (contractCityInfo == null || contractCityInfo.city == null || this.h == null) {
                return -1;
            }
            for (int i = 0; i < this.h.size(); i++) {
                if (!(this.h.get(i) == null || this.h.get(i).city == null || (city = contractCityInfo.city) == null || (str = city.code) == null || !str.equals(this.h.get(i).city.code))) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            getWindow().setSoftInputMode(35);
            getWindow().setWindowAnimations(16973826);
            setContentView(R.layout.detail_phonenum_city_dialog);
            this.b = (TextView) findViewById(R.id.detail_phonenumber_area_dialog_title_tv);
            this.c = (ListView) findViewById(R.id.detail_phonenumber_area_list);
            this.d = (TextView) findViewById(R.id.detail_phonenumber_area_letter_text);
            this.e = (PhonenumSideBar) findViewById(R.id.detail_phonenumber_area_letter_sidebar);
            this.f = (ImageView) findViewById(R.id.detail_phonenumber_area_back_iv);
            if (!TextUtils.isEmpty(this.k)) {
                this.b.setText(this.k);
            }
            a aVar = new a();
            b bVar = new b();
            this.c.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.taobao.android.detail.alicom.widget.PhoneNumSalePlanView.SelectCityDialog.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
                        return;
                    }
                    SelectCityDialog.a(SelectCityDialog.this).setSelectItem(i);
                    SelectCityDialog.a(SelectCityDialog.this).notifyDataSetInvalidated();
                    SelectCityDialog selectCityDialog = SelectCityDialog.this;
                    PhoneNumSalePlanView.r(PhoneNumSalePlanView.this, SelectCityDialog.a(selectCityDialog).getItem(i));
                    SelectCityDialog.this.dismiss();
                }
            });
            this.e.setOnTouchingLetterChangedListener(bVar);
            this.f.setOnClickListener(aVar);
            this.e.setTextView(this.d);
            this.e.setIndexText(this.i);
            PhonenumCityAdapter phonenumCityAdapter = new PhonenumCityAdapter(this.f6532a, this.h);
            this.g = phonenumCityAdapter;
            this.c.setAdapter((ListAdapter) phonenumCityAdapter);
            int i = this.j;
            if (i != -1) {
                this.g.setSelectItem(i);
                this.g.notifyDataSetChanged();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class SelectNetworkDialog extends Dialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Activity f6535a;
        public TextView b;
        public ImageView c;
        public ListView d;
        public final List<FetchComponentData$FetchModel.ComponentData.Network> e;
        public PhonenumNetworkAdapter f;
        public final String g;
        public final int h;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (view.getId() == R.id.detail_phonenumber_network_back_iv) {
                    SelectNetworkDialog.this.dismiss();
                }
            }
        }

        static {
            t2o.a(703594538);
        }

        public SelectNetworkDialog(Activity activity, String str, List<FetchComponentData$FetchModel.ComponentData.Network> list, FetchComponentData$FetchModel.ComponentData.Network network) {
            super(activity, 16973840);
            this.h = -1;
            this.f6535a = activity;
            this.g = str;
            this.e = list;
            this.h = b(network);
        }

        public static /* synthetic */ PhonenumNetworkAdapter a(SelectNetworkDialog selectNetworkDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PhonenumNetworkAdapter) ipChange.ipc$dispatch("829d56e7", new Object[]{selectNetworkDialog});
            }
            return selectNetworkDialog.f;
        }

        public static /* synthetic */ Object ipc$super(SelectNetworkDialog selectNetworkDialog, String str, Object... objArr) {
            if (str.hashCode() == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/alicom/widget/PhoneNumSalePlanView$SelectNetworkDialog");
        }

        public final int b(FetchComponentData$FetchModel.ComponentData.Network network) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f89d7015", new Object[]{this, network})).intValue();
            }
            if (network == null || network.code == null || this.e == null) {
                return -1;
            }
            for (int i = 0; i < this.e.size(); i++) {
                if (this.e.get(i) != null && network.code.equals(this.e.get(i).code)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            getWindow().setSoftInputMode(35);
            getWindow().setWindowAnimations(16973826);
            setContentView(R.layout.detail_phonenum_network_dialog);
            this.b = (TextView) findViewById(R.id.detail_phonenumber_network_dialog_title_tv);
            this.c = (ImageView) findViewById(R.id.detail_phonenumber_network_back_iv);
            this.d = (ListView) findViewById(R.id.detail_phonenumber_network_list);
            if (!TextUtils.isEmpty(this.g)) {
                this.b.setText(this.g);
            }
            a aVar = new a();
            AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() { // from class: com.taobao.android.detail.alicom.widget.PhoneNumSalePlanView.SelectNetworkDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
                        return;
                    }
                    SelectNetworkDialog selectNetworkDialog = SelectNetworkDialog.this;
                    PhoneNumSalePlanView.u(PhoneNumSalePlanView.this, SelectNetworkDialog.a(selectNetworkDialog).getItem(i));
                    SelectNetworkDialog.this.dismiss();
                }
            };
            this.c.setOnClickListener(aVar);
            this.d.setOnItemClickListener(onItemClickListener);
            PhonenumNetworkAdapter phonenumNetworkAdapter = new PhonenumNetworkAdapter(this.f6535a, this.e);
            this.f = phonenumNetworkAdapter;
            this.d.setAdapter((ListAdapter) phonenumNetworkAdapter);
            int i = this.h;
            if (i != -1) {
                this.f.setSelectItem(i);
                this.f.notifyDataSetChanged();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class SelectNumberDialog extends Dialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Activity f6537a;
        public TextView b;
        public ImageView c;
        public EditText d;
        public TextView e;
        public GridView f;
        public TextView g;
        public TextView h;
        public View i;
        public TBCircularProgress j;
        public PhonenumNumberAdapter k;
        public RemoteBusinessListener l;
        public final String m;
        public final String n;
        public final String o;
        public final String p;
        public final String q;
        public final String r;
        public final String s;
        public final String t;
        public boolean u = true;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (view.getId() == R.id.detail_phonenumber_phone_back_iv) {
                    SelectNumberDialog.this.onBackPressed();
                } else if (view.getId() == R.id.detail_phonenumber_number_refush_btn) {
                    SelectNumberDialog.a(SelectNumberDialog.this);
                    SelectNumberDialog selectNumberDialog = SelectNumberDialog.this;
                    SelectNumberDialog.c(selectNumberDialog, SelectNumberDialog.b(selectNumberDialog).getText().toString().replace(" ", ""));
                } else if (view.getId() == R.id.detail_phonenumber_number_search_bn) {
                    if ("关闭".equals(SelectNumberDialog.d(SelectNumberDialog.this).getText().toString())) {
                        SelectNumberDialog.b(SelectNumberDialog.this).setText("");
                        SelectNumberDialog.d(SelectNumberDialog.this).setText("搜索");
                    } else if (!TextUtils.isEmpty(SelectNumberDialog.b(SelectNumberDialog.this).getText())) {
                        SelectNumberDialog.d(SelectNumberDialog.this).setText("关闭");
                    }
                    SelectNumberDialog.a(SelectNumberDialog.this);
                    SelectNumberDialog selectNumberDialog2 = SelectNumberDialog.this;
                    SelectNumberDialog.c(selectNumberDialog2, SelectNumberDialog.b(selectNumberDialog2).getText().toString().replace(" ", ""));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements TextWatcher {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                    return;
                }
                Editable editableText = SelectNumberDialog.b(SelectNumberDialog.this).getEditableText();
                if ((i == 3 || i == 8) && i3 == 0 && i2 == 1) {
                    editableText.delete(i - 1, i);
                    return;
                }
                int f = SelectNumberDialog.f(SelectNumberDialog.this, editableText.toString());
                if (f == 1) {
                    int g = SelectNumberDialog.g(SelectNumberDialog.this, editableText.toString());
                    editableText.delete(g, 1 + g);
                } else if (f == 2) {
                    editableText.insert(3, String.valueOf(' '));
                } else if (f == 3) {
                    editableText.insert(8, String.valueOf(' '));
                } else if (f == 4) {
                    editableText.delete(editableText.length() - 1, editableText.length());
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class c implements View.OnTouchListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public c(SelectNumberDialog selectNumberDialog) {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                return true;
            }
        }

        static {
            t2o.a(703594541);
        }

        public SelectNumberDialog(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            super(activity, 16973840);
            this.f6537a = activity;
            this.m = str;
            this.n = str3;
            this.o = str4;
            this.t = str2;
            this.q = str7;
            this.r = str8;
            this.s = str9;
            this.p = str6;
        }

        public static /* synthetic */ void a(SelectNumberDialog selectNumberDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6f75ae2", new Object[]{selectNumberDialog});
            } else {
                selectNumberDialog.n();
            }
        }

        public static /* synthetic */ EditText b(SelectNumberDialog selectNumberDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EditText) ipChange.ipc$dispatch("b54346f0", new Object[]{selectNumberDialog});
            }
            return selectNumberDialog.d;
        }

        public static /* synthetic */ void c(SelectNumberDialog selectNumberDialog, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b9dca6a", new Object[]{selectNumberDialog, str});
            } else {
                selectNumberDialog.s(str);
            }
        }

        public static /* synthetic */ TextView d(SelectNumberDialog selectNumberDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("2da7af3", new Object[]{selectNumberDialog});
            }
            return selectNumberDialog.h;
        }

        public static /* synthetic */ PhonenumNumberAdapter e(SelectNumberDialog selectNumberDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PhonenumNumberAdapter) ipChange.ipc$dispatch("a11c903a", new Object[]{selectNumberDialog});
            }
            return selectNumberDialog.k;
        }

        public static /* synthetic */ int f(SelectNumberDialog selectNumberDialog, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("150bed9", new Object[]{selectNumberDialog, str})).intValue();
            }
            return selectNumberDialog.r(str);
        }

        public static /* synthetic */ int g(SelectNumberDialog selectNumberDialog, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6ebd7bf8", new Object[]{selectNumberDialog, str})).intValue();
            }
            return selectNumberDialog.q(str);
        }

        public static /* synthetic */ boolean h(SelectNumberDialog selectNumberDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b9d011de", new Object[]{selectNumberDialog})).booleanValue();
            }
            return selectNumberDialog.u;
        }

        public static /* synthetic */ void i(SelectNumberDialog selectNumberDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2da40904", new Object[]{selectNumberDialog});
            } else {
                selectNumberDialog.o();
            }
        }

        public static /* synthetic */ Object ipc$super(SelectNumberDialog selectNumberDialog, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            } else if (hashCode == 143326307) {
                super.onBackPressed();
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/alicom/widget/PhoneNumSalePlanView$SelectNumberDialog");
            }
        }

        public static /* synthetic */ TextView j(SelectNumberDialog selectNumberDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("8c2f0f57", new Object[]{selectNumberDialog});
            }
            return selectNumberDialog.g;
        }

        public static /* synthetic */ TextView k(SelectNumberDialog selectNumberDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("9a3b3936", new Object[]{selectNumberDialog});
            }
            return selectNumberDialog.e;
        }

        public static /* synthetic */ String l(SelectNumberDialog selectNumberDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d5e77d1f", new Object[]{selectNumberDialog});
            }
            return selectNumberDialog.t;
        }

        public static /* synthetic */ int m(SelectNumberDialog selectNumberDialog, List list, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("636600ee", new Object[]{selectNumberDialog, list, str})).intValue();
            }
            return selectNumberDialog.p(list, str);
        }

        public final void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b3da73a", new Object[]{this});
                return;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(this.d.getWindowToken(), 0);
            }
        }

        public final void o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("969b46ab", new Object[]{this});
                return;
            }
            TBCircularProgress tBCircularProgress = this.j;
            if (tBCircularProgress != null) {
                tBCircularProgress.setVisibility(8);
                this.i.setVisibility(8);
            }
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88afc63", new Object[]{this});
                return;
            }
            this.u = false;
            super.onBackPressed();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            getWindow().setSoftInputMode(35);
            getWindow().setWindowAnimations(16973826);
            setContentView(R.layout.detail_phonenum_number_dialog);
            this.b = (TextView) findViewById(R.id.detail_phonenumber_phone_dialog_title_tv);
            this.c = (ImageView) findViewById(R.id.detail_phonenumber_phone_back_iv);
            this.d = (EditText) findViewById(R.id.detail_phonenumber_number_ed);
            this.e = (TextView) findViewById(R.id.detail_phonenumber_number_empty_tv);
            this.f = (GridView) findViewById(R.id.detail_phonenumber_number_gv);
            this.g = (TextView) findViewById(R.id.detail_phonenumber_number_refush_btn);
            this.h = (TextView) findViewById(R.id.detail_phonenumber_number_search_bn);
            this.i = findViewById(R.id.detail_phonenumber_number_mask);
            this.j = (TBCircularProgress) findViewById(R.id.detail_phonenumber_number_query_progressBar);
            if (!TextUtils.isEmpty(this.m)) {
                this.b.setText(this.m);
            }
            a aVar = new a();
            AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() { // from class: com.taobao.android.detail.alicom.widget.PhoneNumSalePlanView.SelectNumberDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
                        return;
                    }
                    if (SelectNumberDialog.e(SelectNumberDialog.this).getItem(i) != null) {
                        str = SelectNumberDialog.e(SelectNumberDialog.this).getItem(i).phoneNum;
                    } else {
                        str = "";
                    }
                    if (SelectNumberDialog.e(SelectNumberDialog.this) != null && !TextUtils.isEmpty(str)) {
                        PhoneNumSalePlanView.v(PhoneNumSalePlanView.this, str);
                        SelectNumberDialog.this.onBackPressed();
                    }
                    SelectNumberDialog.a(SelectNumberDialog.this);
                }
            };
            b bVar = new b();
            c cVar = new c(this);
            this.c.setOnClickListener(aVar);
            this.g.setOnClickListener(aVar);
            this.h.setOnClickListener(aVar);
            this.d.addTextChangedListener(bVar);
            this.f.setOnItemClickListener(onItemClickListener);
            ViewProxy.setOnTouchListener(this.i, cVar);
            this.f.setEmptyView(this.e);
            PhonenumNumberAdapter phonenumNumberAdapter = new PhonenumNumberAdapter(this.f6537a, null);
            this.k = phonenumNumberAdapter;
            this.f.setAdapter((ListAdapter) phonenumNumberAdapter);
            s(this.d.getText().toString().replace(" ", ""));
        }

        public final int p(List<QueryContractPhoneNumberData.PhoneNumberList> list, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1d6890ed", new Object[]{this, list, str})).intValue();
            }
            if (list == null || TextUtils.isEmpty(str)) {
                return -1;
            }
            for (int i = 0; i < list.size(); i++) {
                if (str.equals(list.get(i).phoneNum)) {
                    return i;
                }
            }
            return -1;
        }

        public final int q(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bb7518f8", new Object[]{this, str})).intValue();
            }
            if (str == null) {
                return -1;
            }
            for (int i = 0; i < str.length(); i++) {
                if (!(i == 3 || i == 8 || str.charAt(i) != ' ')) {
                    return i;
                }
            }
            return -1;
        }

        public final int r(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("adc55128", new Object[]{this, str})).intValue();
            }
            if (str == null) {
                return -1;
            }
            if (q(str) != -1) {
                return 1;
            }
            if (str.length() > 3 && str.charAt(3) != ' ') {
                return 2;
            }
            if (str.length() > 8 && str.charAt(8) != ' ') {
                return 3;
            }
            if (str.length() > 13) {
                return 4;
            }
            return 0;
        }

        public final void s(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10a129c0", new Object[]{this, str});
                return;
            }
            if (this.l == null) {
                this.l = new RemoteBusinessListener() { // from class: com.taobao.android.detail.alicom.widget.PhoneNumSalePlanView.SelectNumberDialog.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str2, Object... objArr) {
                        str2.hashCode();
                        int hashCode = str2.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/android/detail/alicom/widget/PhoneNumSalePlanView$SelectNumberDialog$5");
                    }

                    @Override // com.taobao.android.detail.alicom.mtop.RemoteBusinessListener
                    public void onFail(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("99b5aac0", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else if (SelectNumberDialog.h(SelectNumberDialog.this)) {
                            SelectNumberDialog.i(SelectNumberDialog.this);
                            Toast.makeText(SelectNumberDialog.this.getContext(), "网络异常，请稍后重试~", 0).show();
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        } else if (SelectNumberDialog.h(SelectNumberDialog.this)) {
                            if (baseOutDo == null || !(baseOutDo instanceof QueryContractPhoneNumberResult)) {
                                onFail(i, mtopResponse, obj);
                                return;
                            }
                            QueryContractPhoneNumberData data = ((QueryContractPhoneNumberResult) baseOutDo).getData();
                            SelectNumberDialog.i(SelectNumberDialog.this);
                            if (data != null) {
                                List<QueryContractPhoneNumberData.PhoneNumberList> list = data.module;
                                if (list == null || list.size() <= 0 || data.module.get(0) == null || TextUtils.isEmpty(data.module.get(0).phoneNum)) {
                                    SelectNumberDialog.j(SelectNumberDialog.this).setVisibility(8);
                                    SelectNumberDialog.e(SelectNumberDialog.this).update(null);
                                    if (!TextUtils.isEmpty(data.errorMsg)) {
                                        SelectNumberDialog.k(SelectNumberDialog.this).setText(data.errorMsg);
                                    } else if (!TextUtils.isEmpty(SelectNumberDialog.b(SelectNumberDialog.this).getText().toString())) {
                                        SelectNumberDialog.k(SelectNumberDialog.this).setText("亲！好可惜，没有找到匹配的号码噢");
                                    } else {
                                        SelectNumberDialog.k(SelectNumberDialog.this).setText("号码被抢光了，请尝试更换套餐、制式或者地区再查找号码吧。");
                                    }
                                } else {
                                    if (data.module.size() < 20) {
                                        SelectNumberDialog.j(SelectNumberDialog.this).setVisibility(8);
                                    } else {
                                        SelectNumberDialog.j(SelectNumberDialog.this).setVisibility(0);
                                    }
                                    SelectNumberDialog.e(SelectNumberDialog.this).update(data.module);
                                }
                                PhonenumNumberAdapter e = SelectNumberDialog.e(SelectNumberDialog.this);
                                SelectNumberDialog selectNumberDialog = SelectNumberDialog.this;
                                e.setSelectItem(SelectNumberDialog.m(selectNumberDialog, data.module, SelectNumberDialog.l(selectNumberDialog)));
                                SelectNumberDialog.e(SelectNumberDialog.this).notifyDataSetChanged();
                                return;
                            }
                            SelectNumberDialog.j(SelectNumberDialog.this).setVisibility(8);
                        }
                    }
                };
            }
            t();
            kxn.b(str, this.q, this.r, this.o, this.s, this.n, ct2.COLOR_TAG_NOT_ZCACHE_RESOURCE, this.p, this.l);
        }

        public final void t() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73936486", new Object[]{this});
                return;
            }
            TBCircularProgress tBCircularProgress = this.j;
            if (tBCircularProgress != null) {
                tBCircularProgress.setVisibility(0);
                this.i.setVisibility(0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class SelectPlanDialog extends Dialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Activity f6540a;
        public final List<FetchComponentData$FetchModel.ComponentData.Plan> b;
        public TextView c;
        public ListView d;
        public ImageView e;
        public TextView f;
        public PhonenumPlanAdapter g;
        public final int h;
        public final String i;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (view.getId() == R.id.detail_phonenumber_plan_back_iv) {
                    SelectPlanDialog.this.dismiss();
                }
            }
        }

        static {
            t2o.a(703594547);
        }

        public SelectPlanDialog(Activity activity, String str, List<FetchComponentData$FetchModel.ComponentData.Plan> list, FetchComponentData$FetchModel.ComponentData.Plan plan) {
            super(activity, 16973840);
            this.h = -1;
            this.f6540a = activity;
            this.b = list;
            this.i = str;
            this.h = b(plan);
        }

        public static /* synthetic */ PhonenumPlanAdapter a(SelectPlanDialog selectPlanDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PhonenumPlanAdapter) ipChange.ipc$dispatch("b0f19c9d", new Object[]{selectPlanDialog});
            }
            return selectPlanDialog.g;
        }

        public static /* synthetic */ Object ipc$super(SelectPlanDialog selectPlanDialog, String str, Object... objArr) {
            if (str.hashCode() == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/alicom/widget/PhoneNumSalePlanView$SelectPlanDialog");
        }

        public final int b(FetchComponentData$FetchModel.ComponentData.Plan plan) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("88f9c1aa", new Object[]{this, plan})).intValue();
            }
            if (plan == null || plan.planId == null || this.b == null) {
                return -1;
            }
            for (int i = 0; i < this.b.size(); i++) {
                if (!(this.b.get(i) == null || (str = plan.planId) == null || !str.equals(this.b.get(i).planId))) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            getWindow().setSoftInputMode(35);
            getWindow().setWindowAnimations(16973826);
            setContentView(R.layout.detail_phonenum_plan_dialog);
            this.c = (TextView) findViewById(R.id.detail_phonenumber_plan_dialog_title_tv);
            this.d = (ListView) findViewById(R.id.detail_phonenumber_plan_list);
            this.e = (ImageView) findViewById(R.id.detail_phonenumber_plan_back_iv);
            this.f = (TextView) findViewById(R.id.detail_phonenumber_plan_descrip_tv);
            if (!TextUtils.isEmpty(this.i)) {
                this.c.setText(this.i);
            }
            a aVar = new a();
            AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() { // from class: com.taobao.android.detail.alicom.widget.PhoneNumSalePlanView.SelectPlanDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
                        return;
                    }
                    SelectPlanDialog selectPlanDialog = SelectPlanDialog.this;
                    PhoneNumSalePlanView.s(PhoneNumSalePlanView.this, SelectPlanDialog.a(selectPlanDialog).getItem(i));
                    SelectPlanDialog.this.dismiss();
                }
            };
            this.e.setOnClickListener(aVar);
            this.d.setOnItemClickListener(onItemClickListener);
            PhonenumPlanAdapter phonenumPlanAdapter = new PhonenumPlanAdapter(this.b, this.f6540a);
            this.g = phonenumPlanAdapter;
            this.d.setAdapter((ListAdapter) phonenumPlanAdapter);
            int i = this.h;
            if (i != -1) {
                this.g.setSelectItem(i);
                this.g.notifyDataSetChanged();
                List<FetchComponentData$FetchModel.ComponentData.Plan> list = this.b;
                if (list == null || list.get(this.h) == null || TextUtils.isEmpty(this.b.get(this.h).contractDesc)) {
                    this.f.setText("");
                    return;
                }
                TextView textView = this.f;
                textView.setText("温馨提示：" + this.b.get(this.h).contractDesc);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(PhoneNumSalePlanView phoneNumSalePlanView) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Comparator<ContractCityInfo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(PhoneNumSalePlanView phoneNumSalePlanView) {
        }

        /* renamed from: a */
        public int compare(ContractCityInfo contractCityInfo, ContractCityInfo contractCityInfo2) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e72786bf", new Object[]{this, contractCityInfo, contractCityInfo2})).intValue();
            }
            if (contractCityInfo == null || (str = contractCityInfo.sortLetters) == null || contractCityInfo2 == null) {
                return 0;
            }
            return str.compareTo(contractCityInfo2.sortLetters);
        }
    }

    static {
        t2o.a(703594529);
    }

    public PhoneNumSalePlanView(boolean z, Activity activity, gr4 gr4Var, ContractNode contractNode, String str, String str2, ContractSelectedRet contractSelectedRet) {
        super(activity, 16973840);
        this.K = z;
        this.f6531a = activity;
        this.t = contractSelectedRet;
        this.z = str;
        this.A = str2;
        this.L = gr4Var;
        if (contractNode != null) {
            this.u = contractNode.version;
            this.s = C(contractNode.componentData);
        }
    }

    public static /* synthetic */ FetchComponentData$FetchModel.ComponentData.Plan A(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FetchComponentData$FetchModel.ComponentData.Plan) ipChange.ipc$dispatch("f2d98fbd", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.C;
    }

    public static /* synthetic */ RelativeLayout B(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("75852788", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.c;
    }

    public static /* synthetic */ Activity a(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("5d627519", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.f6531a;
    }

    public static /* synthetic */ TextView b(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("d68688e4", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.j;
    }

    public static /* synthetic */ TextView c(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("68b48452", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.l;
    }

    public static /* synthetic */ List d(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bdbee308", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.G;
    }

    public static /* synthetic */ FetchComponentData$FetchModel.ComponentData.Network e(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FetchComponentData$FetchModel.ComponentData.Network) ipChange.ipc$dispatch("a05a4cd9", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.D;
    }

    public static /* synthetic */ RelativeLayout f(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("cf5541b1", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.d;
    }

    public static /* synthetic */ TextView g(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("ff61f656", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.m;
    }

    public static /* synthetic */ String h(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72f6e39d", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.E;
    }

    public static /* synthetic */ String i(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b898263c", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.z;
    }

    public static /* synthetic */ Object ipc$super(PhoneNumSalePlanView phoneNumSalePlanView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 143326307) {
            super.onBackPressed();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/alicom/widget/PhoneNumSalePlanView");
        }
    }

    public static /* synthetic */ String j(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3968db", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.A;
    }

    public static /* synthetic */ ContractNode.Version k(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContractNode.Version) ipChange.ipc$dispatch("665fc788", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.u;
    }

    public static /* synthetic */ boolean l(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb56216b", new Object[]{phoneNumSalePlanView})).booleanValue();
        }
        return phoneNumSalePlanView.E();
    }

    public static /* synthetic */ List m(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("be841236", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.v;
    }

    public static /* synthetic */ RelativeLayout n(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("2bb35acd", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.e;
    }

    public static /* synthetic */ void o(PhoneNumSalePlanView phoneNumSalePlanView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e4ec48", new Object[]{phoneNumSalePlanView, str});
        } else {
            phoneNumSalePlanView.P(str);
        }
    }

    public static /* synthetic */ boolean p(PhoneNumSalePlanView phoneNumSalePlanView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd53c5f7", new Object[]{phoneNumSalePlanView, new Boolean(z)})).booleanValue();
        }
        phoneNumSalePlanView.J = z;
        return z;
    }

    public static /* synthetic */ void q(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c4d2500", new Object[]{phoneNumSalePlanView});
        } else {
            phoneNumSalePlanView.F();
        }
    }

    public static /* synthetic */ void r(PhoneNumSalePlanView phoneNumSalePlanView, ContractCityInfo contractCityInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d29eac", new Object[]{phoneNumSalePlanView, contractCityInfo});
        } else {
            phoneNumSalePlanView.L(contractCityInfo);
        }
    }

    public static /* synthetic */ void s(PhoneNumSalePlanView phoneNumSalePlanView, FetchComponentData$FetchModel.ComponentData.Plan plan) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc01e31", new Object[]{phoneNumSalePlanView, plan});
        } else {
            phoneNumSalePlanView.O(plan);
        }
    }

    public static /* synthetic */ List t(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6837095", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.y;
    }

    public static /* synthetic */ void u(PhoneNumSalePlanView phoneNumSalePlanView, FetchComponentData$FetchModel.ComponentData.Network network) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46a7d7f", new Object[]{phoneNumSalePlanView, network});
        } else {
            phoneNumSalePlanView.M(network);
        }
    }

    public static /* synthetic */ void v(PhoneNumSalePlanView phoneNumSalePlanView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3e3596c", new Object[]{phoneNumSalePlanView, str});
        } else {
            phoneNumSalePlanView.N(str);
        }
    }

    public static /* synthetic */ ContractCityInfo w(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContractCityInfo) ipChange.ipc$dispatch("56cbdbb2", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.B;
    }

    public static /* synthetic */ RelativeLayout x(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("fa9c4884", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.b;
    }

    public static /* synthetic */ TextView y(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("52df5769", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.k;
    }

    public static /* synthetic */ List z(PhoneNumSalePlanView phoneNumSalePlanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2680ea11", new Object[]{phoneNumSalePlanView});
        }
        return phoneNumSalePlanView.F;
    }

    public final FetchComponentData$FetchModel.ComponentData C(List<Map<String, Object>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FetchComponentData$FetchModel.ComponentData) ipChange.ipc$dispatch("52020c36", new Object[]{this, list});
        }
        try {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                for (Map.Entry<String, Object> entry : list.get(i).entrySet()) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return (FetchComponentData$FetchModel.ComponentData) JSON.parseObject(JSON.toJSONString(hashMap), FetchComponentData$FetchModel.ComponentData.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa88b6a", new Object[]{this})).booleanValue();
        }
        if (!(this.b.getVisibility() == 0 && this.B == null) && (!(this.c.getVisibility() == 0 && this.C == null) && (!(this.d.getVisibility() == 0 && this.D == null) && (this.e.getVisibility() != 0 || !TextUtils.isEmpty(this.E))))) {
            this.n.setClickable(true);
            this.n.setBackgroundResource(R.drawable.detail_contractphone_red_corners_bg);
            return true;
        }
        this.n.setClickable(false);
        this.n.setBackgroundResource(R.drawable.detail_contractphone_gray_corners_bg);
        return false;
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("969b46ab", new Object[]{this});
            return;
        }
        TBCircularProgress tBCircularProgress = this.r;
        if (tBCircularProgress != null) {
            tBCircularProgress.setVisibility(8);
            this.q.setVisibility(8);
        }
    }

    public final void H() {
        ContractNode.Version version;
        String str;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6423117", new Object[]{this});
            return;
        }
        ContractSelectedRet contractSelectedRet = this.t;
        if (contractSelectedRet != null && (version = this.u) != null && (str = contractSelectedRet.versionCode) != null && str.equals(version.versionCode)) {
            if (!TextUtils.isEmpty(this.t.cityName) && (str4 = this.t.selectedCity) != null) {
                L((ContractCityInfo) JSON.parseObject(str4, ContractCityInfo.class));
            }
            if (!TextUtils.isEmpty(this.t.planName) && (str3 = this.t.selectedPlan) != null) {
                O((FetchComponentData$FetchModel.ComponentData.Plan) JSON.parseObject(str3, FetchComponentData$FetchModel.ComponentData.Plan.class));
            }
            if (!TextUtils.isEmpty(this.t.networkName) && (str2 = this.t.selectedNetwork) != null) {
                M((FetchComponentData$FetchModel.ComponentData.Network) JSON.parseObject(str2, FetchComponentData$FetchModel.ComponentData.Network.class));
            }
            if (!TextUtils.isEmpty(this.t.phoneNumber) && !"号码随机".equals(this.t.phoneNumber)) {
                N(this.t.phoneNumber);
            }
            this.J = this.t.isSelectedComplete;
        }
    }

    public final void I() {
        List<FetchComponentData$FetchModel.ComponentData.Area> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d04f", new Object[]{this});
            return;
        }
        this.w = null;
        FetchComponentData$FetchModel.ComponentData componentData = this.s;
        if (componentData != null) {
            this.w = componentData.network;
        }
        if (componentData == null || (list = componentData.area) == null || list.size() == 0) {
            this.G = this.w;
            U();
        }
    }

    public final void J() {
        List<FetchComponentData$FetchModel.ComponentData.Area> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c417e6aa", new Object[]{this});
            return;
        }
        this.x = null;
        FetchComponentData$FetchModel.ComponentData componentData = this.s;
        if (componentData != null) {
            List<FetchComponentData$FetchModel.ComponentData.Plan> list2 = componentData.plan;
            if (list2 == null || list2.size() <= 0) {
                List<FetchComponentData$FetchModel.ComponentData.Plan> list3 = this.s.planLite;
                if (list3 != null && list3.size() > 0) {
                    this.x = this.s.planLite;
                }
            } else {
                this.x = this.s.plan;
            }
            FetchComponentData$FetchModel.ComponentData componentData2 = this.s;
            if (componentData2 == null || (list = componentData2.area) == null || list.size() == 0) {
                this.F = this.x;
                V();
            }
        }
    }

    public final void K() {
        FetchComponentData$FetchModel.ComponentData.Number number;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.b = (RelativeLayout) findViewById(R.id.detail_phonenumber_region_rl);
        this.c = (RelativeLayout) findViewById(R.id.detail_phonenumber_plan_rl);
        this.d = (RelativeLayout) findViewById(R.id.detail_phonenumber_network_rl);
        this.e = (RelativeLayout) findViewById(R.id.detail_phonenumber_phone_rl);
        this.f = (TextView) findViewById(R.id.detail_phonenumber_city_tv);
        this.g = (TextView) findViewById(R.id.detail_phonenumber_plan_tv);
        this.h = (TextView) findViewById(R.id.detail_phonenumber_network_tv);
        this.i = (TextView) findViewById(R.id.detail_phonenumber_number_tv);
        this.j = (TextView) findViewById(R.id.detail_phonenumber_city_title_tv);
        this.k = (TextView) findViewById(R.id.detail_phonenumber_plan_title_tv);
        this.l = (TextView) findViewById(R.id.detail_phonenumber_network_title_tv);
        this.m = (TextView) findViewById(R.id.detail_phonenumber_number_title_tv);
        this.o = (ImageView) findViewById(R.id.detail_phonenumber_back_iv);
        this.p = (TextView) findViewById(R.id.detail_phonenumber_title_tv);
        this.n = (Button) findViewById(R.id.detail_phonenumber_plan_ok_btn);
        this.q = findViewById(R.id.detail_phonenum_diaog_mask);
        this.r = (TBCircularProgress) findViewById(R.id.detail_phonenumber_dialog_progressBar);
        a aVar = new a();
        b bVar = new b(this);
        this.b.setOnClickListener(aVar);
        this.c.setOnClickListener(aVar);
        this.d.setOnClickListener(aVar);
        this.e.setOnClickListener(aVar);
        this.o.setOnClickListener(aVar);
        this.n.setOnClickListener(aVar);
        ViewProxy.setOnTouchListener(this.q, bVar);
        I();
        J();
        G();
        H();
        FetchComponentData$FetchModel.ComponentData componentData = this.s;
        if (componentData != null && !TextUtils.isEmpty(componentData.areaName)) {
            this.j.setText(this.s.areaName);
        }
        FetchComponentData$FetchModel.ComponentData componentData2 = this.s;
        if (componentData2 != null && !TextUtils.isEmpty(componentData2.planLiteName)) {
            this.k.setText(this.s.planLiteName);
        }
        FetchComponentData$FetchModel.ComponentData componentData3 = this.s;
        if (componentData3 != null && !TextUtils.isEmpty(componentData3.planName)) {
            this.k.setText(this.s.planName);
        }
        FetchComponentData$FetchModel.ComponentData componentData4 = this.s;
        if (componentData4 != null && !TextUtils.isEmpty(componentData4.networkName)) {
            this.l.setText(this.s.networkName);
        }
        FetchComponentData$FetchModel.ComponentData componentData5 = this.s;
        if (componentData5 == null || (number = componentData5.phoneNumber) == null || number.selectNumType == 2) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            if (!TextUtils.isEmpty(this.s.phoneNumberName)) {
                this.m.setText(this.s.phoneNumberName);
            }
        }
        ContractNode.Version version = this.u;
        if (version != null && !TextUtils.isEmpty(version.secondJumpTitle)) {
            this.p.setText(this.u.secondJumpTitle);
        }
        E();
    }

    public final void L(ContractCityInfo contractCityInfo) {
        FetchComponentData$FetchModel.ComponentData.Area.City city;
        FetchComponentData$FetchModel.ComponentData.Area.City city2;
        List<FetchComponentData$FetchModel.ComponentData.Plan> list;
        FetchComponentData$FetchModel.ComponentData.Area.City city3;
        ContractCityInfo contractCityInfo2;
        FetchComponentData$FetchModel.ComponentData.Area.City city4;
        FetchComponentData$FetchModel.ComponentData.Area.City city5;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49e779c1", new Object[]{this, contractCityInfo});
        } else if (contractCityInfo == null || (contractCityInfo2 = this.B) == null || (city4 = contractCityInfo.city) == null || (city5 = contractCityInfo2.city) == null || (str = city4.code) == null || !str.equals(city5.code)) {
            this.J = false;
            this.B = contractCityInfo;
            if (!(contractCityInfo == null || (city3 = contractCityInfo.city) == null)) {
                this.f.setText(city3.name);
                this.f.setTextColor(-16777216);
            }
            S();
            Q();
            R();
            this.F = null;
            ContractCityInfo contractCityInfo3 = this.B;
            if (!(contractCityInfo3 == null || (city2 = contractCityInfo3.city) == null || city2.planIds == null || (list = this.x) == null || list.size() <= 0)) {
                this.F = new ArrayList();
                for (String str2 : this.B.city.planIds) {
                    for (FetchComponentData$FetchModel.ComponentData.Plan plan : this.x) {
                        if (plan != null && str2.equals(plan.planId)) {
                            this.F.add(plan);
                        }
                    }
                }
            }
            this.G = null;
            ContractCityInfo contractCityInfo4 = this.B;
            if (!(contractCityInfo4 == null || (city = contractCityInfo4.city) == null || city.network == null || this.w == null)) {
                this.G = new ArrayList();
                for (String str3 : this.B.city.network) {
                    for (FetchComponentData$FetchModel.ComponentData.Network network : this.w) {
                        if (!(str3 == null || network == null || !str3.equals(network.code))) {
                            this.G.add(network);
                        }
                    }
                }
            }
            V();
            U();
            E();
        }
    }

    public final void M(FetchComponentData$FetchModel.ComponentData.Network network) {
        String str;
        FetchComponentData$FetchModel.ComponentData.Network network2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee84f74", new Object[]{this, network});
        } else if (network == null || (str = network.code) == null || (network2 = this.D) == null || !str.equals(network2)) {
            this.J = false;
            this.D = network;
            if (network != null) {
                this.h.setText(network.name);
                this.h.setTextColor(v14.a("#000000"));
            }
            R();
            E();
        }
    }

    public final void N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4827714", new Object[]{this, str});
        } else if (str == null || !str.equals(this.E)) {
            this.J = false;
            this.E = str;
            if (!TextUtils.isEmpty(str)) {
                this.i.setText(dsq.a(this.E));
                this.i.setTextColor(-16777216);
            }
            E();
        }
    }

    public final void O(FetchComponentData$FetchModel.ComponentData.Plan plan) {
        String str;
        FetchComponentData$FetchModel.ComponentData.Plan plan2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e7c4ec", new Object[]{this, plan});
        } else if (plan == null || (str = plan.planId) == null || (plan2 = this.C) == null || !str.equals(plan2.planId)) {
            this.J = false;
            this.C = plan;
            if (plan != null) {
                this.g.setText(plan.name);
                this.g.setTextColor(v14.a("#000000"));
            }
            Q();
            R();
            E();
        }
    }

    public final void P(String str) {
        String str2;
        String str3;
        String str4;
        FetchComponentData$FetchModel.ComponentData.Area.City city;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b54ac8", new Object[]{this, str});
            return;
        }
        if (this.I == null) {
            this.I = new RemoteBusinessListener() { // from class: com.taobao.android.detail.alicom.widget.PhoneNumSalePlanView.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str5, Object... objArr) {
                    str5.hashCode();
                    int hashCode = str5.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str5 + "' with hashcode " + hashCode + " in com/taobao/android/detail/alicom/widget/PhoneNumSalePlanView$4");
                }

                @Override // com.taobao.android.detail.alicom.mtop.RemoteBusinessListener
                public void onFail(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("99b5aac0", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    PhoneNumSalePlanView.q(PhoneNumSalePlanView.this);
                    try {
                        JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                        if (dataJsonObject != null) {
                            Toast.makeText(PhoneNumSalePlanView.this.getContext(), ((PreholdingPhoneNumberData) JSON.parseObject(dataJsonObject.toString(), PreholdingPhoneNumberData.class)).errorMsg, 0).show();
                        }
                    } catch (Exception unused) {
                        Toast.makeText(PhoneNumSalePlanView.this.getContext(), "网络异常，请稍后重试~", 0).show();
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (baseOutDo == null || !(baseOutDo instanceof PreholdingPhoneNumberResult)) {
                        onFail(i, mtopResponse, obj);
                    } else {
                        PreholdingPhoneNumberData data = ((PreholdingPhoneNumberResult) baseOutDo).getData();
                        PhoneNumSalePlanView.q(PhoneNumSalePlanView.this);
                        if (data == null) {
                            return;
                        }
                        if (PreholdingPhoneNumberData.PRE_SUCCESS.equals(data.errorCode)) {
                            PhoneNumSalePlanView.p(PhoneNumSalePlanView.this, true);
                            PhoneNumSalePlanView.this.onBackPressed();
                        } else if (!TextUtils.isEmpty(data.errorMsg)) {
                            Toast.makeText(PhoneNumSalePlanView.this.getContext(), data.errorMsg, 0).show();
                        } else {
                            Toast.makeText(PhoneNumSalePlanView.this.getContext(), "预占号码失败~", 0).show();
                        }
                    }
                }
            };
        }
        T();
        RemoteBusiness remoteBusiness = this.H;
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
        }
        ContractCityInfo contractCityInfo = this.B;
        String str5 = "";
        if (contractCityInfo == null || (city = contractCityInfo.city) == null) {
            str2 = str5;
        } else {
            str2 = city.code;
        }
        if (contractCityInfo == null) {
            str3 = str5;
        } else {
            str3 = contractCityInfo.provinceCode;
        }
        String str6 = this.A;
        FetchComponentData$FetchModel.ComponentData.Plan plan = this.C;
        if (plan == null) {
            str4 = str5;
        } else {
            str4 = plan.planId;
        }
        String str7 = this.z;
        ContractNode.Version version = this.u;
        if (version != null) {
            str5 = version.versionCode;
        }
        this.H = kxn.a(str, str2, str3, str6, str4, str7, str5, this.I);
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f8e6854", new Object[]{this});
            return;
        }
        this.E = null;
        this.i.setText("请选择");
        this.i.setTextColor(v14.a("#cccccc"));
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeacba33", new Object[]{this});
            return;
        }
        this.C = null;
        this.g.setText("请选择");
        this.g.setTextColor(v14.a("#cccccc"));
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        TBCircularProgress tBCircularProgress = this.r;
        if (tBCircularProgress != null) {
            tBCircularProgress.setVisibility(0);
            this.q.setVisibility(0);
        }
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eed10e6", new Object[]{this});
            return;
        }
        List<FetchComponentData$FetchModel.ComponentData.Network> list = this.G;
        if (list == null || list.size() == 0) {
            this.d.setVisibility(8);
            return;
        }
        this.d.setVisibility(0);
        if (this.w.size() == 1 && this.G.get(0) != null) {
            M(this.G.get(0));
        }
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("165b4519", new Object[]{this});
            return;
        }
        List<FetchComponentData$FetchModel.ComponentData.Plan> list = this.F;
        if (list == null || list.size() == 0) {
            this.c.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        if (this.F.size() == 1 && this.F.get(0) != null) {
            O(this.F.get(0));
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        gr4 gr4Var = this.L;
        if (gr4Var != null) {
            gr4Var.a(D());
        }
        RemoteBusiness remoteBusiness = this.H;
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
        }
        Activity activity = this.f6531a;
        if (this.K) {
            str = "contractPhone";
        } else {
            str = TrtcConstants.TRTC_PARAMS_PHONE_NUMBER;
        }
        rul.b(activity, "Page_Contract", str);
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        getWindow().setSoftInputMode(35);
        getWindow().setWindowAnimations(16973826);
        setContentView(R.layout.detail_phonenum_sale_dialog);
        Activity activity = this.f6531a;
        if (this.K) {
            str = "contractPhone";
        } else {
            str = TrtcConstants.TRTC_PARAMS_PHONE_NUMBER;
        }
        rul.a(activity, "Page_Contract", "Page_Contract", str);
        K();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (view.getId() == R.id.detail_phonenumber_region_rl) {
                PhoneNumSalePlanView phoneNumSalePlanView = PhoneNumSalePlanView.this;
                SelectCityDialog selectCityDialog = new SelectCityDialog(PhoneNumSalePlanView.a(phoneNumSalePlanView), PhoneNumSalePlanView.b(PhoneNumSalePlanView.this).getText().toString(), PhoneNumSalePlanView.m(PhoneNumSalePlanView.this), PhoneNumSalePlanView.t(PhoneNumSalePlanView.this), PhoneNumSalePlanView.w(PhoneNumSalePlanView.this));
                selectCityDialog.setCanceledOnTouchOutside(false);
                selectCityDialog.show();
                rul.c(PhoneNumSalePlanView.a(PhoneNumSalePlanView.this));
            } else if (view.getId() == R.id.detail_phonenumber_plan_rl) {
                if (PhoneNumSalePlanView.x(PhoneNumSalePlanView.this).getVisibility() == 0 && PhoneNumSalePlanView.w(PhoneNumSalePlanView.this) == null) {
                    Toast.makeText(PhoneNumSalePlanView.this.getContext(), "亲，请先选择城市~", 0).show();
                    return;
                }
                PhoneNumSalePlanView phoneNumSalePlanView2 = PhoneNumSalePlanView.this;
                SelectPlanDialog selectPlanDialog = new SelectPlanDialog(PhoneNumSalePlanView.a(phoneNumSalePlanView2), PhoneNumSalePlanView.y(PhoneNumSalePlanView.this).getText().toString(), PhoneNumSalePlanView.z(PhoneNumSalePlanView.this), PhoneNumSalePlanView.A(PhoneNumSalePlanView.this));
                selectPlanDialog.setCanceledOnTouchOutside(false);
                selectPlanDialog.show();
                rul.g(PhoneNumSalePlanView.a(PhoneNumSalePlanView.this));
            } else if (view.getId() == R.id.detail_phonenumber_network_rl) {
                if (PhoneNumSalePlanView.x(PhoneNumSalePlanView.this).getVisibility() == 0 && PhoneNumSalePlanView.w(PhoneNumSalePlanView.this) == null) {
                    Toast.makeText(PhoneNumSalePlanView.this.getContext(), "亲，请先选择城市~", 0).show();
                } else if (PhoneNumSalePlanView.B(PhoneNumSalePlanView.this).getVisibility() == 0 && PhoneNumSalePlanView.A(PhoneNumSalePlanView.this) == null) {
                    Toast.makeText(PhoneNumSalePlanView.this.getContext(), "亲，请先选择套餐~", 0).show();
                } else {
                    PhoneNumSalePlanView phoneNumSalePlanView3 = PhoneNumSalePlanView.this;
                    SelectNetworkDialog selectNetworkDialog = new SelectNetworkDialog(PhoneNumSalePlanView.a(phoneNumSalePlanView3), PhoneNumSalePlanView.c(PhoneNumSalePlanView.this).getText().toString(), PhoneNumSalePlanView.d(PhoneNumSalePlanView.this), PhoneNumSalePlanView.e(PhoneNumSalePlanView.this));
                    selectNetworkDialog.setCanceledOnTouchOutside(false);
                    selectNetworkDialog.show();
                    rul.e(PhoneNumSalePlanView.a(PhoneNumSalePlanView.this));
                }
            } else if (view.getId() == R.id.detail_phonenumber_phone_rl) {
                if (PhoneNumSalePlanView.x(PhoneNumSalePlanView.this).getVisibility() == 0 && PhoneNumSalePlanView.w(PhoneNumSalePlanView.this) == null) {
                    Toast.makeText(PhoneNumSalePlanView.this.getContext(), "亲，请先选择城市~", 0).show();
                } else if (PhoneNumSalePlanView.B(PhoneNumSalePlanView.this).getVisibility() == 0 && PhoneNumSalePlanView.A(PhoneNumSalePlanView.this) == null) {
                    Toast.makeText(PhoneNumSalePlanView.this.getContext(), "亲，请先选择套餐~", 0).show();
                } else if (PhoneNumSalePlanView.f(PhoneNumSalePlanView.this).getVisibility() == 0 && PhoneNumSalePlanView.e(PhoneNumSalePlanView.this) == null) {
                    Toast.makeText(PhoneNumSalePlanView.this.getContext(), "亲，请先选择制式~", 0).show();
                } else {
                    PhoneNumSalePlanView phoneNumSalePlanView4 = PhoneNumSalePlanView.this;
                    Activity a2 = PhoneNumSalePlanView.a(phoneNumSalePlanView4);
                    String charSequence = PhoneNumSalePlanView.g(PhoneNumSalePlanView.this).getText().toString();
                    String h = PhoneNumSalePlanView.h(PhoneNumSalePlanView.this);
                    String i = PhoneNumSalePlanView.i(PhoneNumSalePlanView.this);
                    String j = PhoneNumSalePlanView.j(PhoneNumSalePlanView.this);
                    if (PhoneNumSalePlanView.k(PhoneNumSalePlanView.this) == null) {
                        str = "";
                    } else {
                        str = PhoneNumSalePlanView.k(PhoneNumSalePlanView.this).versionCode;
                    }
                    if (PhoneNumSalePlanView.e(PhoneNumSalePlanView.this) == null) {
                        str2 = "";
                    } else {
                        str2 = PhoneNumSalePlanView.e(PhoneNumSalePlanView.this).code;
                    }
                    if (PhoneNumSalePlanView.w(PhoneNumSalePlanView.this) == null || PhoneNumSalePlanView.w(PhoneNumSalePlanView.this).city == null) {
                        str3 = "";
                    } else {
                        str3 = PhoneNumSalePlanView.w(PhoneNumSalePlanView.this).city.code;
                    }
                    if (PhoneNumSalePlanView.w(PhoneNumSalePlanView.this) == null) {
                        str4 = "";
                    } else {
                        str4 = PhoneNumSalePlanView.w(PhoneNumSalePlanView.this).provinceCode;
                    }
                    if (PhoneNumSalePlanView.A(PhoneNumSalePlanView.this) == null) {
                        str5 = "";
                    } else {
                        str5 = PhoneNumSalePlanView.A(PhoneNumSalePlanView.this).planId;
                    }
                    SelectNumberDialog selectNumberDialog = new SelectNumberDialog(a2, charSequence, h, i, j, str, str2, str3, str4, str5);
                    selectNumberDialog.setCanceledOnTouchOutside(false);
                    selectNumberDialog.show();
                    rul.f(PhoneNumSalePlanView.a(PhoneNumSalePlanView.this));
                }
            } else if (view.getId() == R.id.detail_phonenumber_back_iv) {
                rul.h(PhoneNumSalePlanView.a(PhoneNumSalePlanView.this));
                PhoneNumSalePlanView.this.onBackPressed();
            } else if (view.getId() == R.id.detail_phonenumber_plan_ok_btn && PhoneNumSalePlanView.l(PhoneNumSalePlanView.this)) {
                rul.d(PhoneNumSalePlanView.a(PhoneNumSalePlanView.this));
                if (PhoneNumSalePlanView.n(PhoneNumSalePlanView.this).getVisibility() == 0) {
                    PhoneNumSalePlanView phoneNumSalePlanView5 = PhoneNumSalePlanView.this;
                    PhoneNumSalePlanView.o(phoneNumSalePlanView5, PhoneNumSalePlanView.h(phoneNumSalePlanView5));
                    return;
                }
                PhoneNumSalePlanView.p(PhoneNumSalePlanView.this, true);
                PhoneNumSalePlanView.this.onBackPressed();
            }
        }
    }

    public final ContractSelectedRet D() {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContractSelectedRet) ipChange.ipc$dispatch("3077667d", new Object[]{this});
        }
        ContractSelectedRet contractSelectedRet = new ContractSelectedRet();
        contractSelectedRet.isSelectedComplete = this.J;
        ContractNode.Version version = this.u;
        contractSelectedRet.versionCode = version == null ? null : version.versionCode;
        contractSelectedRet.selectedRetMap = new HashMap();
        FetchComponentData$FetchModel.ComponentData.Plan plan = this.C;
        if (plan != null) {
            str = plan.planId;
            contractSelectedRet.selectedPlan = JSON.toJSONString(plan);
            contractSelectedRet.planName = this.C.name;
        } else {
            str = "0";
        }
        if (this.B != null) {
            str2 = str + "_" + this.B.provinceCode + "_" + this.B.city.code;
            ContractCityInfo contractCityInfo = this.B;
            contractSelectedRet.cityName = contractCityInfo.city.name;
            contractSelectedRet.selectedCity = JSON.toJSONString(contractCityInfo);
        } else {
            str2 = str + "_0_0";
        }
        if (TextUtils.isEmpty(this.E) || "号码随机".equals(this.E)) {
            str3 = str2 + "_0";
            if (!this.K && this.e.getVisibility() == 8) {
                contractSelectedRet.phoneNumber = "号码随机";
            }
        } else {
            str3 = str2 + "_" + this.E;
            contractSelectedRet.phoneNumber = this.E;
        }
        if (this.D != null) {
            str4 = str3 + "_" + this.D.code;
            FetchComponentData$FetchModel.ComponentData.Network network = this.D;
            contractSelectedRet.networkName = network.name;
            contractSelectedRet.selectedNetwork = JSON.toJSONString(network);
        } else {
            str4 = str3 + "_0";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append("_0_");
        ContractNode.Version version2 = this.u;
        if (version2 == null) {
            i = 0;
        } else {
            i = version2.versionCode;
        }
        sb.append(i);
        contractSelectedRet.selectedRetMap.put("alicom_wtt_param", sb.toString());
        if (this.u.noShopCart) {
            contractSelectedRet.selectedRetMap.put("alicom_wtt_cart", "0");
        } else {
            contractSelectedRet.selectedRetMap.put("alicom_wtt_cart", "1");
        }
        return contractSelectedRet;
    }

    public final void G() {
        List<FetchComponentData$FetchModel.ComponentData.Area> list;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c892ec", new Object[]{this});
            return;
        }
        this.v = null;
        FetchComponentData$FetchModel.ComponentData componentData = this.s;
        if (componentData == null || (list = componentData.area) == null || list.size() == 0) {
            this.b.setVisibility(8);
            return;
        }
        this.b.setVisibility(0);
        this.v = new ArrayList();
        this.y = new ArrayList();
        for (int i = 0; i < this.s.area.size(); i++) {
            FetchComponentData$FetchModel.ComponentData.Area area = this.s.area.get(i);
            if (!(area == null || area.city == null)) {
                for (int i2 = 0; i2 < area.city.size(); i2++) {
                    ContractCityInfo contractCityInfo = new ContractCityInfo();
                    FetchComponentData$FetchModel.ComponentData.Area.City city = area.city.get(i2);
                    contractCityInfo.city = city;
                    contractCityInfo.provinceCode = area.code;
                    if ("true".equals(city.selected)) {
                        L(contractCityInfo);
                    }
                    if (area.city.get(i2) != null) {
                        str = area.city.get(i2).cityInitial;
                    } else {
                        str = "";
                    }
                    if (str != null && str.matches("[A-Z]")) {
                        contractCityInfo.sortLetters = str;
                        if (!((ArrayList) this.y).contains(str)) {
                            ((ArrayList) this.y).add(str);
                        }
                    }
                    ((ArrayList) this.v).add(contractCityInfo);
                }
            }
        }
        try {
            c cVar = new c(this);
            Collections.sort(this.y);
            Collections.sort(this.v, cVar);
        } catch (Exception unused) {
        }
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6f7add2", new Object[]{this});
            return;
        }
        List<FetchComponentData$FetchModel.ComponentData.Network> list = this.w;
        if (list == null || list.size() != 1 || this.w.get(0) == null) {
            this.D = null;
            this.h.setText("请选择");
            this.h.setTextColor(v14.a("#cccccc"));
        }
    }
}
