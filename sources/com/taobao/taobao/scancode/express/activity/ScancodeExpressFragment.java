package com.taobao.taobao.scancode.express.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.kakalib.express.ExpressResult;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.huoyan.ui.KakaLibBaseFragmentPage;
import tb.ey3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ScancodeExpressFragment extends KakaLibBaseFragmentPage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ExpressSectionsAdapter c;
    public ExpressResult.ExpressSection[] d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class ExpressSectionsAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private LayoutInflater mInflater;

        static {
            t2o.a(760217679);
        }

        public ExpressSectionsAdapter(Context context) {
            this.mInflater = LayoutInflater.from(context);
        }

        public static /* synthetic */ Object ipc$super(ExpressSectionsAdapter expressSectionsAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/express/activity/ScancodeExpressFragment$ExpressSectionsAdapter");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (ScancodeExpressFragment.r2(ScancodeExpressFragment.this) == null) {
                return 0;
            }
            return ScancodeExpressFragment.r2(ScancodeExpressFragment.this).length;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
            }
            return ScancodeExpressFragment.r2(ScancodeExpressFragment.this)[(ScancodeExpressFragment.r2(ScancodeExpressFragment.this).length - 1) - i];
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
            }
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            b bVar;
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            if (view == null) {
                view = this.mInflater.inflate(R.layout.kakalib_listitem_card_express, (ViewGroup) null);
                bVar = new b();
                bVar.f12921a = (TextView) view.findViewById(R.id.express_listitem_sincenow);
                bVar.b = (TextView) view.findViewById(R.id.express_listitem_statusdesc);
                bVar.c = (TextView) view.findViewById(R.id.express_listitem_statustime);
                view.setTag(bVar);
            } else {
                bVar = (b) view.getTag();
            }
            ExpressResult.ExpressSection expressSection = ScancodeExpressFragment.r2(ScancodeExpressFragment.this)[(ScancodeExpressFragment.r2(ScancodeExpressFragment.this).length - 1) - i];
            TextView textView = bVar.b;
            String str3 = "";
            if (expressSection != null) {
                str = expressSection.statusDesc;
            } else {
                str = str3;
            }
            textView.setText(str);
            TextView textView2 = bVar.c;
            if (expressSection != null) {
                str2 = expressSection.statusTime;
            } else {
                str2 = str3;
            }
            textView2.setText(str2);
            TextView textView3 = bVar.f12921a;
            if (expressSection != null) {
                str3 = expressSection.sinceNow;
            }
            textView3.setText(str3);
            if (i == 0) {
                bVar.f12921a.setBackgroundResource(R.drawable.kakalib_bg_express_sincenow_first);
                bVar.c.setTextColor(-8992512);
                bVar.b.setTextColor(-16777216);
                view.setBackgroundResource(R.drawable.kakalib_bg_listitem_first);
            } else {
                bVar.f12921a.setBackgroundResource(R.drawable.kakalib_bg_express_sincenow);
                bVar.c.setTextColor(-4340542);
                bVar.b.setTextColor(-4340543);
                if (i == ScancodeExpressFragment.r2(ScancodeExpressFragment.this).length - 1) {
                    view.setBackgroundResource(R.drawable.kakalib_bg_listitem_last);
                } else {
                    view.setBackgroundResource(R.drawable.kakalib_bg_listitem);
                }
            }
            return view;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public TextView f12921a;
        public TextView b;
        public TextView c;

        static {
            t2o.a(760217678);
        }

        public b() {
        }
    }

    static {
        t2o.a(760217676);
    }

    public static /* synthetic */ Object ipc$super(ScancodeExpressFragment scancodeExpressFragment, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/express/activity/ScancodeExpressFragment");
    }

    public static /* synthetic */ ExpressResult.ExpressSection[] r2(ScancodeExpressFragment scancodeExpressFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExpressResult.ExpressSection[]) ipChange.ipc$dispatch("82a7fe9f", new Object[]{scancodeExpressFragment});
        }
        return scancodeExpressFragment.d;
    }

    @Override // com.taobao.taobao.scancode.huoyan.ui.KakaLibBaseFragmentPage, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        p2("Page_FastMail_Info");
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(R.layout.kakalib_activity_express, (ViewGroup) null, false);
        Intent intent = getActivity().getIntent();
        Parcelable[] parcelableArrayExtra = getActivity().getIntent().getParcelableArrayExtra("section");
        if (parcelableArrayExtra != null && parcelableArrayExtra.length > 0) {
            ExpressResult.ExpressSection[] expressSectionArr = new ExpressResult.ExpressSection[parcelableArrayExtra.length];
            this.d = expressSectionArr;
            System.arraycopy(parcelableArrayExtra, 0, expressSectionArr, 0, parcelableArrayExtra.length);
        }
        String stringExtra = intent.getStringExtra("company");
        String stringExtra2 = intent.getStringExtra("expressno");
        ListView listView = (ListView) inflate.findViewById(R.id.activity_express_sections);
        this.c = new ExpressSectionsAdapter(getActivity());
        View inflate2 = LayoutInflater.from(getActivity()).inflate(R.layout.kakalib_express_header, (ViewGroup) null);
        ((TextView) inflate2.findViewById(R.id.activity_express_company)).setText(stringExtra);
        ((TextView) inflate2.findViewById(R.id.activity_express_no)).setText(getActivity().getResources().getString(R.string.kakalib_express_no) + ":    " + stringExtra2);
        listView.addHeaderView(inflate2, null, false);
        listView.setHeaderDividersEnabled(false);
        listView.setAdapter((ListAdapter) this.c);
        this.c.notifyDataSetChanged();
        ey3.g().h("Express_UI_detail_fragment");
        return inflate;
    }
}
