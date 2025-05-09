package com.taobao.detail.rate.v2;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.RateDisplayApplication;
import com.taobao.detail.rate.v2.PreviewItemV2;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.nin;
import tb.odg;
import tb.pin;
import tb.qrf;
import tb.vwo;
import tb.wh6;
import tb.wsq;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/detail/rate/v2/RateViewPagerFragmentV2;", "Landroidx/fragment/app/DialogFragment;", "", "<init>", "()V", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RateViewPagerFragmentV2 extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f10357a = "RateViewPagerFragmentV2";
    public ViewGroup c;
    public ViewPager d;
    public CommonPageAdapterV2 e;
    public TextView f;
    public TUrlImageView g;
    public TUrlImageView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public pin l;

    public static /* synthetic */ Object ipc$super(RateViewPagerFragmentV2 rateViewPagerFragmentV2, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 2133689546) {
            super.onStart();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/detail/rate/v2/RateViewPagerFragmentV2");
        }
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b76066cf", new Object[]{this, str});
        }
        if (!wsq.C0(str, '{', false, 2, null) || !wsq.U0(str, '}', false, 2, null)) {
            return str;
        }
        String substring = str.substring(1, wsq.S(str));
        ckf.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        pin pinVar = this.l;
        if (pinVar != null) {
            pinVar.g();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        WindowManager.LayoutParams layoutParams;
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        Dialog dialog = getDialog();
        ckf.f(dialog, "dialog");
        Window window = dialog.getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.dimAmount = 0.2f;
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
        if (window != null) {
            window.setAttributes(layoutParams);
        }
        if (window != null) {
            window.setNavigationBarColor(-16777216);
        }
        if (window != null) {
            window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        if (window != null) {
            window.setStatusBarColor(0);
        }
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(1280);
        }
    }

    public final void p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
        }
    }

    public final void r2() {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        int i;
        View view7;
        View view8;
        View view9;
        View view10;
        View view11;
        View view12;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.c;
        View view13 = null;
        if (viewGroup != null) {
            view = viewGroup.findViewById(R.id.view_stub_header_view_v2);
        } else {
            view = null;
        }
        ViewStub viewStub = (ViewStub) view;
        if (viewStub != null) {
            view2 = viewStub.inflate();
        } else {
            view2 = null;
        }
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 != null) {
            view3 = viewGroup2.findViewById(R.id.view_stub_right_view_v2);
        } else {
            view3 = null;
        }
        ViewStub viewStub2 = (ViewStub) view3;
        if (viewStub2 != null) {
            view4 = viewStub2.inflate();
        } else {
            view4 = null;
        }
        ViewGroup viewGroup3 = this.c;
        if (viewGroup3 != null) {
            view5 = viewGroup3.findViewById(R.id.view_stub_footer_view_v2);
        } else {
            view5 = null;
        }
        ViewStub viewStub3 = (ViewStub) view5;
        if (viewStub3 != null) {
            view6 = viewStub3.inflate();
        } else {
            view6 = null;
        }
        if (view4 != null) {
            view4.setVisibility(8);
        }
        if (u2()) {
            i = vwo.g(getActivity());
        } else {
            i = 0;
        }
        int c = vwo.c(getActivity());
        if (view2 != null) {
            view2.setPadding(0, i, 0, 0);
        }
        if (view6 != null) {
            view6.setPadding(0, 0, 0, c);
        }
        ViewGroup viewGroup4 = this.c;
        if (viewGroup4 != null) {
            view7 = viewGroup4.findViewById(R.id.rate_indicator_textView);
        } else {
            view7 = null;
        }
        this.f = (TextView) view7;
        ViewGroup viewGroup5 = this.c;
        if (viewGroup5 != null) {
            view8 = viewGroup5.findViewById(R.id.rate_like_icon);
        } else {
            view8 = null;
        }
        this.g = (TUrlImageView) view8;
        ViewGroup viewGroup6 = this.c;
        if (viewGroup6 != null) {
            view9 = viewGroup6.findViewById(R.id.rate_comment_icon);
        } else {
            view9 = null;
        }
        this.h = (TUrlImageView) view9;
        ViewGroup viewGroup7 = this.c;
        if (viewGroup7 != null) {
            view10 = viewGroup7.findViewById(R.id.tv_user_nick);
        } else {
            view10 = null;
        }
        this.i = (TextView) view10;
        ViewGroup viewGroup8 = this.c;
        if (viewGroup8 != null) {
            view11 = viewGroup8.findViewById(R.id.tv_sku);
        } else {
            view11 = null;
        }
        this.j = (TextView) view11;
        ViewGroup viewGroup9 = this.c;
        if (viewGroup9 != null) {
            view12 = viewGroup9.findViewById(R.id.tv_comment);
        } else {
            view12 = null;
        }
        this.k = (TextView) view12;
        ViewGroup viewGroup10 = this.c;
        if (viewGroup10 != null) {
            view13 = viewGroup10.findViewById(R.id.rate_back);
        }
        if (view13 != null) {
            ViewProxy.setOnClickListener(view13, new nin(this));
        }
        TUrlImageView tUrlImageView = this.g;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01wSqHIT24f2aw1VtsP_!!6000000007417-2-tps-128-128.png");
        }
        TUrlImageView tUrlImageView2 = this.h;
        if (tUrlImageView2 != null) {
            tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01u1VjDv1wnjBIAxDCp_!!6000000006353-2-tps-128-128.png");
        }
        s2();
    }

    public final void v2(int i) {
        int i2;
        PreviewItemV2 previewItemV2;
        Map<String, String> map;
        int i3;
        String str;
        int i4;
        PreviewItemV2.UserInfo userInfo;
        String str2;
        String str3;
        Map<String, String> skuMap;
        String obj;
        String str4;
        PreviewItemV2.UserInfo userInfo2;
        List<PreviewItemV2> data;
        List<PreviewItemV2> data2;
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9426fce", new Object[]{this, new Integer(i)});
            return;
        }
        CommonPageAdapterV2 commonPageAdapterV2 = this.e;
        if (commonPageAdapterV2 == null || (data2 = commonPageAdapterV2.getData()) == null) {
            i2 = 0;
        } else {
            i2 = data2.size();
        }
        if (i >= 0 && i < i2) {
            CommonPageAdapterV2 commonPageAdapterV22 = this.e;
            String str5 = null;
            if (commonPageAdapterV22 == null || (data = commonPageAdapterV22.getData()) == null) {
                previewItemV2 = null;
            } else {
                previewItemV2 = data.get(i);
            }
            TextView textView = this.i;
            if (textView != null) {
                if (previewItemV2 == null || (userInfo2 = previewItemV2.getUserInfo()) == null) {
                    str4 = null;
                } else {
                    str4 = userInfo2.getNick();
                }
                textView.setText(str4);
            }
            TextView textView2 = this.j;
            if (textView2 != null) {
                if (previewItemV2 == null || (skuMap = previewItemV2.getSkuMap()) == null || (obj = skuMap.toString()) == null) {
                    str3 = null;
                } else {
                    str3 = a(obj);
                }
                textView2.setText(str3);
            }
            TextView textView3 = this.k;
            if (textView3 != null) {
                if (previewItemV2 != null) {
                    str2 = previewItemV2.getContent();
                } else {
                    str2 = null;
                }
                textView3.setText(str2);
            }
            TextView textView4 = this.i;
            if (textView4 != null) {
                if (previewItemV2 == null || (userInfo = previewItemV2.getUserInfo()) == null) {
                    str = null;
                } else {
                    str = userInfo.getNick();
                }
                if (str == null || str.length() == 0) {
                    i4 = 8;
                } else {
                    i4 = 0;
                }
                textView4.setVisibility(i4);
            }
            TextView textView5 = this.j;
            if (textView5 != null) {
                if (previewItemV2 != null) {
                    map = previewItemV2.getSkuMap();
                } else {
                    map = null;
                }
                if (map == null || map.isEmpty()) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                textView5.setVisibility(i3);
            }
            TextView textView6 = this.k;
            if (textView6 != null) {
                if (previewItemV2 != null) {
                    str5 = previewItemV2.getContent();
                }
                if (str5 == null || str5.length() == 0) {
                    i5 = 8;
                }
                textView6.setVisibility(i5);
            }
            TextView textView7 = this.f;
            if (textView7 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(i + 1);
                sb.append(wh6.DIR);
                sb.append(i2);
                textView7.setText(sb.toString());
            }
        }
    }

    public final void s2() {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77226e75", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        View view = null;
        JSONObject jSONObject = RateDisplayApplication.previewDataMap.get(arguments != null ? arguments.getString("tagId") : null);
        ArrayList arrayList = new ArrayList();
        if (!(jSONObject == null || (jSONArray = jSONObject.getJSONArray("list")) == null)) {
            for (Object obj : jSONArray) {
                if (!(obj instanceof JSON)) {
                    obj = null;
                }
                Object javaObject = JSON.toJavaObject((JSON) obj, PreviewItemV2.class);
                ckf.f(javaObject, "JSON.toJavaObject(it as?…reviewItemV2::class.java)");
                arrayList.add(javaObject);
            }
        }
        int h = qrf.h(jSONObject, "index", 0);
        CommonPageAdapterV2 commonPageAdapterV2 = new CommonPageAdapterV2(getActivity());
        this.e = commonPageAdapterV2;
        commonPageAdapterV2.setData(arrayList);
        CommonPageAdapterV2 commonPageAdapterV22 = this.e;
        if (commonPageAdapterV22 != null) {
            commonPageAdapterV22.i(this.l);
        }
        CommonPageAdapterV2 commonPageAdapterV23 = this.e;
        if (commonPageAdapterV23 != null) {
            commonPageAdapterV23.h(h);
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            view = viewGroup.findViewById(R.id.rate_pic_pager);
        }
        ViewPager viewPager = (ViewPager) view;
        this.d = viewPager;
        if (viewPager != null) {
            viewPager.setAdapter(this.e);
        }
        ViewPager viewPager2 = this.d;
        if (viewPager2 != null) {
            viewPager2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.taobao.detail.rate.v2.RateViewPagerFragmentV2$initViewPager$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    } else {
                        RateViewPagerFragmentV2.this.v2(i);
                    }
                }
            });
        }
        ViewPager viewPager3 = this.d;
        if (viewPager3 != null) {
            viewPager3.setCurrentItem(h);
        }
        v2(h);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        odg.d(this.f10357a, "onCreate.start");
        super.onCreate(bundle);
        pin pinVar = new pin();
        this.l = pinVar;
        pinVar.d(getArguments());
        setStyle(1, R.style.Animation_AppCompat_Dialog);
        pin pinVar2 = this.l;
        if (pinVar2 != null) {
            pinVar2.f();
        }
        odg.d(this.f10357a, "onCreate.end");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ckf.g(layoutInflater, "inflater");
        odg.d(this.f10357a, "onCreateView.start");
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.rate_picpreview_pager_layout_v2, viewGroup, false);
        this.c = viewGroup2;
        if (viewGroup2 != null) {
            viewGroup2.setBackgroundColor(-16777216);
        }
        p2();
        r2();
        odg.d(this.f10357a, "onCreateView.end");
        return this.c;
    }

    public final boolean u2() {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return false;
        }
        View decorView = window.getDecorView();
        ckf.f(decorView, "window.decorView");
        if ((decorView.getSystemUiVisibility() & 1024) != 1024) {
            return false;
        }
        View decorView2 = window.getDecorView();
        ckf.f(decorView2, "window.decorView");
        return (decorView2.getSystemUiVisibility() & 256) == 256;
    }
}
