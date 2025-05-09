package com.taobao.android.shop.activity;

import android.content.ClipboardManager;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.weex.BarChart;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PerfPanelFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean o = true;
    public static boolean p = false;
    public static final List<Pair<Long, Long>> q = new ArrayList();
    public static final List<Pair<Long, Long>> r = new ArrayList();
    public static final List<Pair<Long, Long>> s = new ArrayList();
    public static final List<Pair<Long, Long>> t = new ArrayList();
    public static final List<Pair<Long, Long>> u = new ArrayList();
    public static final List<Pair<Long, Long>> v = new ArrayList();
    public static final List<Pair<Long, Long>> w = new ArrayList();
    public static final List<Pair<Long, Long>> x = new ArrayList();
    public static final List<Pair<Long, Long>> y = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public View f9374a;
    public CheckBox c;
    public CheckBox d;
    public CheckBox e;
    public CheckBox f;
    public CheckBox g;
    public BarChart h;
    public TextView i;
    public View j;
    public Spinner k;
    public TextView l;
    public int m = -1;
    public final View.OnClickListener n = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class ShopDebugFeature implements CompoundButton.OnCheckedChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(764411914);
        }

        private ShopDebugFeature() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                ((ShopRenderActivity) PerfPanelFragment.this.getActivity()).hidePerfPanel();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (PerfPanelFragment.B2()) {
                PerfPanelFragment.D2(PerfPanelFragment.this).setBackgroundColor(PerfPanelFragment.this.getResources().getColor(17170443));
                PerfPanelFragment.C2(false);
            } else {
                PerfPanelFragment.D2(PerfPanelFragment.this).setBackgroundColor(Color.parseColor("#80FFFFFF"));
                PerfPanelFragment.C2(true);
            }
        }
    }

    static {
        t2o.a(764411905);
    }

    public static /* synthetic */ int A2(PerfPanelFragment perfPanelFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d74e38f9", new Object[]{perfPanelFragment, new Integer(i)})).intValue();
        }
        perfPanelFragment.m = i;
        return i;
    }

    public static /* synthetic */ boolean B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f21a642", new Object[0])).booleanValue();
        }
        return o;
    }

    public static /* synthetic */ boolean C2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b87d8598", new Object[]{new Boolean(z)})).booleanValue();
        }
        o = z;
        return z;
    }

    public static /* synthetic */ View D2(PerfPanelFragment perfPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("71abe01f", new Object[]{perfPanelFragment});
        }
        return perfPanelFragment.f9374a;
    }

    public static /* synthetic */ Object ipc$super(PerfPanelFragment perfPanelFragment, String str, Object... objArr) {
        if (str.hashCode() == 1860817453) {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/activity/PerfPanelFragment");
    }

    public static /* synthetic */ boolean p2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        p = z;
        return z;
    }

    public static /* synthetic */ void r2(PerfPanelFragment perfPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ffadbd6", new Object[]{perfPanelFragment});
        } else {
            perfPanelFragment.N2();
        }
    }

    public static /* synthetic */ CheckBox s2(PerfPanelFragment perfPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CheckBox) ipChange.ipc$dispatch("9ad473fa", new Object[]{perfPanelFragment});
        }
        return perfPanelFragment.c;
    }

    public static /* synthetic */ String u2(PerfPanelFragment perfPanelFragment, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87f3822a", new Object[]{perfPanelFragment, str, str2, str3});
        }
        return perfPanelFragment.E2(str, str2, str3);
    }

    public static /* synthetic */ TextView v2(PerfPanelFragment perfPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("93b66f8d", new Object[]{perfPanelFragment});
        }
        return perfPanelFragment.l;
    }

    public static /* synthetic */ BarChart z2(PerfPanelFragment perfPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BarChart) ipChange.ipc$dispatch("a0fca2b8", new Object[]{perfPanelFragment});
        }
        return perfPanelFragment.h;
    }

    public final String E2(String str, String str2, String str3) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40447a9f", new Object[]{this, str, str2, str3});
        }
        StringBuilder sb = new StringBuilder();
        do {
            int indexOf = str.indexOf(str2, i2);
            if (indexOf != -1) {
                if (str.indexOf("&", str2.length() + indexOf) == -1) {
                    i = str.length();
                } else {
                    i = str.indexOf("&", str2.length() + indexOf);
                }
                sb.append(str.substring(i2, str2.length() + indexOf));
                sb.append("<font color='" + str3 + "'>");
                sb.append(str.substring(indexOf + str2.length(), i));
                sb.append("</font>");
                i2 = i;
            } else {
                sb.append(str.substring(i2, str.length()));
                i2 = str.length();
            }
        } while (i2 < str.length());
        return sb.toString();
    }

    public final Pair<Float, Float> J2(List<Pair<Long, Long>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("f25fbe5e", new Object[]{this, list});
        }
        Long l = 0L;
        Long l2 = 0L;
        for (Pair<Long, Long> pair : list) {
            l = Long.valueOf(l.longValue() + ((Long) pair.first).longValue());
            l2 = Long.valueOf(l2.longValue() + ((Long) pair.second).longValue());
        }
        if (p) {
            return new Pair<>(Float.valueOf(l.floatValue() / list.size()), Float.valueOf(l2.floatValue() / list.size()));
        }
        return new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
    }

    public final Pair<Long, Long> K2(List<Pair<Long, Long>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("adf279ce", new Object[]{this, list});
        }
        return list.get(list.size() - 1);
    }

    public final Pair<Long, Long> M2(List<Pair<Long, Long>> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("ebea2ee5", new Object[]{this, list, new Integer(i)});
        }
        if (i < 0 || i >= list.size()) {
            return new Pair<>(0L, 0L);
        }
        return list.get(i);
    }

    public final void O2() {
        Pair pair;
        Pair pair2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66b9e7ce", new Object[]{this});
            return;
        }
        ShopRenderActivity shopRenderActivity = (ShopRenderActivity) getActivity();
        long j = shopRenderActivity.mTotalCost;
        if (j >= 10000 || j <= 0) {
            pair = new Pair(0L, 0L);
        } else {
            pair = new Pair(0L, Long.valueOf(shopRenderActivity.mTotalCost));
        }
        long j2 = shopRenderActivity.mRouterCost;
        if (j2 >= 10000 || j2 <= 0) {
            pair2 = new Pair(0L, 0L);
        } else {
            pair2 = new Pair(0L, Long.valueOf(shopRenderActivity.mRouterCost));
        }
        Pair pair3 = new Pair(Long.valueOf(shopRenderActivity.mActivityPrepareCostBegin), Long.valueOf(shopRenderActivity.mActivityPrepareCost));
        Pair pair4 = new Pair(Long.valueOf(shopRenderActivity.mDataPrefetchCostBegin), Long.valueOf(shopRenderActivity.mDataPrefetchCost));
        Pair pair5 = new Pair(Long.valueOf(shopRenderActivity.mFrameJSLoadCostBegin), Long.valueOf(shopRenderActivity.mFrameJSLoadCost));
        Pair pair6 = new Pair(Long.valueOf(shopRenderActivity.mFrameJSRenderCostBegin), Long.valueOf(shopRenderActivity.mFrameJSRenderCost));
        Pair pair7 = new Pair(Long.valueOf(shopRenderActivity.mPagedataCostBegin), Long.valueOf(shopRenderActivity.mPagedataCost));
        Pair pair8 = new Pair(Long.valueOf(shopRenderActivity.mInnerJSLoadCostBegin), Long.valueOf(shopRenderActivity.mInnerJSLoadCost));
        Pair pair9 = new Pair(Long.valueOf(shopRenderActivity.mInnerJSRenderCostBegin), Long.valueOf(shopRenderActivity.mInnerJSRenderCost));
        ((ArrayList) q).add(pair);
        ((ArrayList) r).add(pair2);
        ((ArrayList) s).add(pair3);
        ((ArrayList) t).add(pair4);
        ((ArrayList) u).add(pair5);
        ((ArrayList) v).add(pair6);
        ((ArrayList) w).add(pair7);
        ((ArrayList) x).add(pair8);
        ((ArrayList) y).add(pair9);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        return layoutInflater.inflate(R.layout.debug_perf_panel, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        this.f9374a = view.findViewById(R.id.perf_panel);
        this.c = (CheckBox) view.findViewById(R.id.is_show_avg);
        this.d = (CheckBox) view.findViewById(R.id.is_show_report_log);
        this.e = (CheckBox) view.findViewById(R.id.is_use_weexsdk_back_tread);
        this.f = (CheckBox) view.findViewById(R.id.is_use_online_js);
        this.h = (BarChart) view.findViewById(R.id.bar_chart);
        this.i = (TextView) view.findViewById(R.id.desc);
        this.j = view.findViewById(R.id.close);
        this.k = (Spinner) view.findViewById(R.id.previous_compare);
        this.g = (CheckBox) view.findViewById(R.id.show_url);
        this.l = (TextView) view.findViewById(R.id.url);
        ViewProxy.setOnClickListener(this.f9374a, this.n);
        ViewProxy.setOnClickListener(view.findViewById(R.id.title_area), this.n);
        ShopRenderActivity shopRenderActivity = (ShopRenderActivity) getActivity();
        O2();
        if (!o) {
            this.f9374a.setBackgroundColor(getResources().getColor(17170443));
        }
        this.c.setChecked(p);
        if (p) {
            CheckBox checkBox = this.c;
            checkBox.setText("显示平均值(" + ((ArrayList) q).size() + "次)");
        }
        this.c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.taobao.android.shop.activity.PerfPanelFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                    return;
                }
                PerfPanelFragment.p2(z);
                PerfPanelFragment.r2(PerfPanelFragment.this);
                CheckBox s2 = PerfPanelFragment.s2(PerfPanelFragment.this);
                s2.setText("显示平均值(" + ((ArrayList) PerfPanelFragment.q).size() + "次)");
            }
        });
        this.d.setChecked(ShopRenderActivity.sDebugEndableJSReport);
        this.d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.taobao.android.shop.activity.PerfPanelFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                    return;
                }
                ShopRenderActivity shopRenderActivity2 = (ShopRenderActivity) PerfPanelFragment.this.getActivity();
                ShopRenderActivity.sDebugEndableJSReport = z;
            }
        });
        this.e.setChecked(ShopRenderActivity.sDebugDisableWeexSDKBackThread);
        this.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.taobao.android.shop.activity.PerfPanelFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                    return;
                }
                ShopRenderActivity shopRenderActivity2 = (ShopRenderActivity) PerfPanelFragment.this.getActivity();
                ShopRenderActivity.sDebugDisableWeexSDKBackThread = z;
            }
        });
        this.g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.taobao.android.shop.activity.PerfPanelFragment.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                } else if (z) {
                    ShopRenderActivity shopRenderActivity2 = (ShopRenderActivity) PerfPanelFragment.this.getActivity();
                    ((ClipboardManager) PerfPanelFragment.this.getActivity().getSystemService("clipboard")).setText(shopRenderActivity2.mBundleUrl + "\n\n" + shopRenderActivity2.mTargetInnerUrl);
                    String u2 = PerfPanelFragment.u2(PerfPanelFragment.this, PerfPanelFragment.u2(PerfPanelFragment.this, PerfPanelFragment.u2(PerfPanelFragment.this, shopRenderActivity2.mBundleUrl + "<p>" + shopRenderActivity2.mTargetInnerUrl + "<p>已经复制到剪贴板", "shopId=", "#FF0000"), "sellerId=", "#00FF00"), "shop_navi=", "#0000FF");
                    PerfPanelFragment.v2(PerfPanelFragment.this).setVisibility(0);
                    PerfPanelFragment.v2(PerfPanelFragment.this).setText(Html.fromHtml(u2));
                    PerfPanelFragment.z2(PerfPanelFragment.this).setVisibility(8);
                } else {
                    PerfPanelFragment.v2(PerfPanelFragment.this).setVisibility(8);
                    PerfPanelFragment.z2(PerfPanelFragment.this).setVisibility(0);
                }
            }
        });
        this.f.setChecked(ShopRenderActivity.sDebugUseOnlineJS);
        this.f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.taobao.android.shop.activity.PerfPanelFragment.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                    return;
                }
                ShopRenderActivity shopRenderActivity2 = (ShopRenderActivity) PerfPanelFragment.this.getActivity();
                ShopRenderActivity.sDebugUseOnlineJS = z;
            }
        });
        ViewProxy.setOnClickListener(this.j, new a());
        this.i.setText("");
        ArrayList arrayList = new ArrayList();
        for (int i = -1; i < ((ArrayList) q).size(); i++) {
            HashMap hashMap = new HashMap();
            if (i == -1) {
                hashMap.put("index", "对比以前数据");
            } else {
                hashMap.put("index", "对比第 " + String.valueOf(i + 1) + " 次");
            }
            arrayList.add(hashMap);
        }
        this.k.setAdapter((SpinnerAdapter) new SimpleAdapter(getActivity(), arrayList, R.layout.debug_perf_spinner, new String[]{"index"}, new int[]{R.id.index}));
        this.k.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.taobao.android.shop.activity.PerfPanelFragment.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view2, int i2, long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cb0d7f99", new Object[]{this, adapterView, view2, new Integer(i2), new Long(j)});
                    return;
                }
                PerfPanelFragment.A2(PerfPanelFragment.this, i2 - 1);
                PerfPanelFragment.r2(PerfPanelFragment.this);
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c3d2c76", new Object[]{this, adapterView});
                }
            }
        });
        N2();
    }

    public final void N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a85d0ca", new Object[]{this});
            return;
        }
        int i = this.m;
        ArrayList arrayList = new ArrayList();
        arrayList.add("Total");
        arrayList.add("router");
        arrayList.add("activityCreate");
        arrayList.add("fetchMtop");
        arrayList.add("frameJSLoad");
        arrayList.add("frameJSRender");
        arrayList.add("pagedataCdn");
        arrayList.add("InnerJSLoad");
        arrayList.add("InnerJSRender");
        if (-1 == i) {
            this.h.setSectionsAndColumnTitles(new ArrayList(Arrays.asList("时间轴 (从 点击 到 首页的onRenderFinish)")), arrayList);
            BarChart barChart = this.h;
            List<Pair<Long, Long>> list = q;
            barChart.addTiming(0, 0, K2(list), J2(list));
            BarChart barChart2 = this.h;
            List<Pair<Long, Long>> list2 = r;
            barChart2.addTiming(0, 1, K2(list2), J2(list2));
            BarChart barChart3 = this.h;
            List<Pair<Long, Long>> list3 = s;
            barChart3.addTiming(0, 2, K2(list3), J2(list3));
            BarChart barChart4 = this.h;
            List<Pair<Long, Long>> list4 = t;
            barChart4.addTiming(0, 3, K2(list4), J2(list4));
            BarChart barChart5 = this.h;
            List<Pair<Long, Long>> list5 = u;
            barChart5.addTiming(0, 4, K2(list5), J2(list5));
            BarChart barChart6 = this.h;
            List<Pair<Long, Long>> list6 = v;
            barChart6.addTiming(0, 5, K2(list6), J2(list6));
            BarChart barChart7 = this.h;
            List<Pair<Long, Long>> list7 = w;
            barChart7.addTiming(0, 6, K2(list7), J2(list7));
            BarChart barChart8 = this.h;
            List<Pair<Long, Long>> list8 = x;
            barChart8.addTiming(0, 7, K2(list8), J2(list8));
            BarChart barChart9 = this.h;
            List<Pair<Long, Long>> list9 = y;
            barChart9.addTiming(0, 8, K2(list9), J2(list9));
            this.h.requestLayout();
            this.h.invalidate();
        } else if (i >= 0) {
            List<Pair<Long, Long>> list10 = q;
            if (i < ((ArrayList) list10).size()) {
                arrayList.remove("ApmFrameVisible");
                arrayList.remove("ApmFrameInteractive");
                arrayList.remove("ApmInnerVisible");
                arrayList.remove("ApmInnerInteractive");
                this.h.setSectionsAndColumnTitles(new ArrayList(Arrays.asList("时间轴 (从 点击 到 首页的onRenderFinish)", "对比组")), arrayList);
                this.h.addTiming(0, 0, K2(list10), J2(list10));
                BarChart barChart10 = this.h;
                List<Pair<Long, Long>> list11 = r;
                barChart10.addTiming(0, 1, K2(list11), J2(list11));
                BarChart barChart11 = this.h;
                List<Pair<Long, Long>> list12 = s;
                barChart11.addTiming(0, 2, K2(list12), J2(list12));
                BarChart barChart12 = this.h;
                List<Pair<Long, Long>> list13 = t;
                barChart12.addTiming(0, 3, K2(list13), J2(list13));
                BarChart barChart13 = this.h;
                List<Pair<Long, Long>> list14 = u;
                barChart13.addTiming(0, 4, K2(list14), J2(list14));
                BarChart barChart14 = this.h;
                List<Pair<Long, Long>> list15 = v;
                barChart14.addTiming(0, 5, K2(list15), J2(list15));
                BarChart barChart15 = this.h;
                List<Pair<Long, Long>> list16 = w;
                barChart15.addTiming(0, 6, K2(list16), J2(list16));
                BarChart barChart16 = this.h;
                List<Pair<Long, Long>> list17 = x;
                barChart16.addTiming(0, 7, K2(list17), J2(list17));
                BarChart barChart17 = this.h;
                List<Pair<Long, Long>> list18 = y;
                barChart17.addTiming(0, 8, K2(list18), J2(list18));
                this.h.addTiming(1, 0, M2(list10, i), J2(list10));
                this.h.addTiming(1, 1, M2(list11, i), J2(list11));
                this.h.addTiming(1, 2, M2(list12, i), J2(list12));
                this.h.addTiming(1, 3, M2(list13, i), J2(list13));
                this.h.addTiming(1, 4, M2(list14, i), J2(list14));
                this.h.addTiming(1, 5, M2(list15, i), J2(list15));
                this.h.addTiming(1, 6, M2(list16, i), J2(list16));
                this.h.addTiming(1, 7, M2(list17, i), J2(list17));
                this.h.addTiming(1, 8, M2(list18, i), J2(list18));
                this.h.requestLayout();
                this.h.invalidate();
            }
        }
    }
}
