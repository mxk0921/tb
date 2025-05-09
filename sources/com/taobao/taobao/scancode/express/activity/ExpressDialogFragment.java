package com.taobao.taobao.scancode.express.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.kakalib.express.ExpressResult;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.huoyan.ui.KaDialogFragment;
import java.util.ArrayList;
import java.util.List;
import tb.ey3;
import tb.rb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ExpressDialogFragment extends KaDialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<ExpressResult> e;
    public String f;
    public int g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class ExpressItemAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(760217673);
        }

        private ExpressItemAdapter() {
        }

        public static /* synthetic */ Object ipc$super(ExpressItemAdapter expressItemAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/express/activity/ExpressDialogFragment$ExpressItemAdapter");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (ExpressDialogFragment.v2(ExpressDialogFragment.this) == null) {
                return 0;
            }
            return ExpressDialogFragment.v2(ExpressDialogFragment.this).size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
            }
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            ExpressResult expressResult = (ExpressResult) ExpressDialogFragment.v2(ExpressDialogFragment.this).get(i);
            if (ExpressDialogFragment.this.getActivity() == null) {
                return null;
            }
            View inflate = View.inflate(ExpressDialogFragment.this.getActivity(), R.layout.kakalib_famelayout_express_item, null);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.img_taobao);
            ((TextView) inflate.findViewById(R.id.txt_expressname)).setText(expressResult.companyName);
            if (expressResult.isTaobaoExpress()) {
                imageView.setVisibility(0);
            }
            inflate.setTag(expressResult);
            return inflate;
        }

        @Override // android.widget.Adapter
        public ExpressResult getItem(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ExpressResult) ipChange.ipc$dispatch("6a7997de", new Object[]{this, new Integer(i)}) : (ExpressResult) ExpressDialogFragment.v2(ExpressDialogFragment.this).get(i);
        }
    }

    static {
        t2o.a(760217671);
    }

    private ExpressDialogFragment() {
    }

    public static /* synthetic */ Object ipc$super(ExpressDialogFragment expressDialogFragment, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/express/activity/ExpressDialogFragment");
    }

    public static /* synthetic */ String u2(ExpressDialogFragment expressDialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed15ea75", new Object[]{expressDialogFragment});
        }
        return expressDialogFragment.f;
    }

    public static /* synthetic */ List v2(ExpressDialogFragment expressDialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8e26fe5d", new Object[]{expressDialogFragment});
        }
        return expressDialogFragment.e;
    }

    public static ExpressDialogFragment z2(String str, ArrayList<ExpressResult> arrayList, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExpressDialogFragment) ipChange.ipc$dispatch("12286a72", new Object[]{str, arrayList, new Integer(i)});
        }
        ExpressDialogFragment expressDialogFragment = new ExpressDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("expresscode", str);
        bundle.putParcelableArrayList("express", arrayList);
        bundle.putInt(rb.RESULT_KEY, i);
        expressDialogFragment.setArguments(bundle);
        return expressDialogFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        this.f = getArguments().getString("expresscode");
        this.e = getArguments().getParcelableArrayList("express");
        this.g = getArguments().getInt(rb.RESULT_KEY);
        View inflate = layoutInflater.inflate(R.layout.kakalib_dialog_express, viewGroup);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.express_container);
        ((TextView) inflate.findViewById(R.id.unkown_code)).setText(this.f);
        List<ExpressResult> list = this.e;
        if (list == null || list.size() == 0) {
            linearLayout.setVisibility(8);
            if (this.g == 0) {
                TBS.Page.buttonClicked("Page_FastMail_Error");
            } else {
                TBS.Page.buttonClicked("Page_FastMail_NoData");
            }
        } else {
            ((ImageView) inflate.findViewById(R.id.img_express_dialog)).setImageResource(R.drawable.kakalib_express_icon);
            ListView listView = (ListView) inflate.findViewById(R.id.activity_express_itemsListview);
            listView.setAdapter((ListAdapter) new ExpressItemAdapter());
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.taobao.taobao.scancode.express.activity.ExpressDialogFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
                        return;
                    }
                    TBS.Page.buttonClicked("FastMail_Button");
                    ExpressResult expressResult = (ExpressResult) adapterView.getItemAtPosition(i);
                    expressResult.mExpressCode = ExpressDialogFragment.u2(ExpressDialogFragment.this);
                    Intent intent = new Intent(ExpressDialogFragment.this.getActivity(), ScancodeExpressActivity.class);
                    intent.putExtra("section", expressResult.stepInfo);
                    intent.putExtra("company", expressResult.companyName);
                    intent.putExtra("expressno", ExpressDialogFragment.u2(ExpressDialogFragment.this));
                    ExpressDialogFragment.this.startActivity(intent);
                    ExpressDialogFragment.this.dismiss();
                }
            });
        }
        ey3.g().h("Express_UI_dialog");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.e = null;
        super.onDestroy();
    }
}
