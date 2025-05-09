package com.taobao.mytaobao.newSettingV2.holder;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.mytaobao.newSettingV2.NewGeneralSettingV2Activity;
import com.taobao.mytaobao.newSettingV2.data.NewGeneralSettingDataModel;
import com.taobao.schedule.ViewProxy;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.Iterator;
import tb.l0d;
import tb.o32;
import tb.r0k;
import tb.suv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NewGeneralSettingViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f11229a;
    public final TextView b;
    public final View c;
    public final TextView d;
    public final TextView e;
    public final Switch f;
    public final LinearLayout g;
    public final TextView h;
    public final View i;
    public final View j;
    public l0d k;
    public o32<NewGeneralSettingDataModel> l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f11230a;
        public final /* synthetic */ NewGeneralSettingDataModel b;
        public final /* synthetic */ String c;

        public a(JSONObject jSONObject, NewGeneralSettingDataModel newGeneralSettingDataModel, String str) {
            this.f11230a = jSONObject;
            this.b = newGeneralSettingDataModel;
            this.c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            NewGeneralSettingViewHolder.b0(NewGeneralSettingViewHolder.this, this.b, this.c, this.f11230a.getJSONArray("itemClick"), null);
            o32<NewGeneralSettingDataModel> o32Var = NewGeneralSettingViewHolder.this.l;
            if (o32Var != null) {
                ((NewGeneralSettingV2Activity.b) o32Var).a(true, null, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f11231a;
        public final /* synthetic */ String b;
        public final /* synthetic */ NewGeneralSettingDataModel c;

        public b(JSONObject jSONObject, String str, NewGeneralSettingDataModel newGeneralSettingDataModel) {
            this.f11231a = jSONObject;
            this.b = str;
            this.c = newGeneralSettingDataModel;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            JSONArray jSONArray = this.f11231a.getJSONArray("switchChange");
            boolean isChecked = NewGeneralSettingViewHolder.this.f.isChecked();
            if (r0k.KEY_INLINE_VOLUME.equals(this.b)) {
                isChecked = !isChecked;
            }
            r0k.P(this.b, Boolean.valueOf(isChecked));
            this.c.switchState = NewGeneralSettingViewHolder.this.f.isChecked();
            if (NewGeneralSettingViewHolder.c0(NewGeneralSettingViewHolder.this) != null) {
                NewGeneralSettingViewHolder.c0(NewGeneralSettingViewHolder.this).R(this.c, this.b, NewGeneralSettingViewHolder.this.f.isChecked());
            }
            NewGeneralSettingViewHolder newGeneralSettingViewHolder = NewGeneralSettingViewHolder.this;
            NewGeneralSettingViewHolder.b0(newGeneralSettingViewHolder, this.c, this.b, jSONArray, Boolean.valueOf(newGeneralSettingViewHolder.f.isChecked()));
        }
    }

    static {
        t2o.a(745537764);
    }

    public NewGeneralSettingViewHolder(Context context, View view) {
        super(view);
        this.f11229a = view.findViewById(R.id.mytaobao_divider_no_title);
        this.b = (TextView) view.findViewById(R.id.mytaobao_divider_with_title);
        this.c = view.findViewById(R.id.mytaobao_divider_line);
        this.d = (TextView) view.findViewById(R.id.mytaobao_setting_title);
        this.e = (TextView) view.findViewById(R.id.mytaobao_setting_desc);
        this.f = (Switch) view.findViewById(R.id.mytaobao_setting_switch);
        this.g = (LinearLayout) view.findViewById(R.id.mytaobao_setting_right_content);
        this.h = (TextView) view.findViewById(R.id.mytaobao_setting_right_tips);
        this.i = view.findViewById(R.id.viewArrowRight);
        this.j = view.findViewById(R.id.mytaobao_setting_item);
    }

    public static /* synthetic */ void b0(NewGeneralSettingViewHolder newGeneralSettingViewHolder, NewGeneralSettingDataModel newGeneralSettingDataModel, String str, JSONArray jSONArray, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("975b56f4", new Object[]{newGeneralSettingViewHolder, newGeneralSettingDataModel, str, jSONArray, bool});
        } else {
            newGeneralSettingViewHolder.e0(newGeneralSettingDataModel, str, jSONArray, bool);
        }
    }

    public static /* synthetic */ l0d c0(NewGeneralSettingViewHolder newGeneralSettingViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l0d) ipChange.ipc$dispatch("24ae072f", new Object[]{newGeneralSettingViewHolder});
        }
        return newGeneralSettingViewHolder.k;
    }

    public static /* synthetic */ Object ipc$super(NewGeneralSettingViewHolder newGeneralSettingViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/newSettingV2/holder/NewGeneralSettingViewHolder");
    }

    public final void e0(NewGeneralSettingDataModel newGeneralSettingDataModel, String str, JSONArray jSONArray, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("529ff0c0", new Object[]{this, newGeneralSettingDataModel, str, jSONArray, bool});
        } else if (jSONArray != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) next;
                    String string = jSONObject.getString("type");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("field");
                    if ("openUrl".equals(string)) {
                        f0(jSONObject2);
                    } else if ("userTrack".equals(string)) {
                        d0(jSONObject2, bool);
                    }
                }
            }
        }
    }

    public final void f0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9355fa4", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            Nav.from(Globals.getApplication()).toUri(jSONObject.getString("url"));
        }
    }

    public void g0(l0d l0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1660508d", new Object[]{this, l0dVar});
        } else {
            this.k = l0dVar;
        }
    }

    public void h0(NewGeneralSettingDataModel newGeneralSettingDataModel) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d40d9233", new Object[]{this, newGeneralSettingDataModel});
            return;
        }
        String str = newGeneralSettingDataModel.nativeKey;
        JSONObject jSONObject = newGeneralSettingDataModel.events;
        if (jSONObject != null && (view = this.j) != null) {
            ViewProxy.setOnClickListener(view, new a(jSONObject, newGeneralSettingDataModel, str));
            this.f.setOnClickListener(new b(jSONObject, str, newGeneralSettingDataModel));
        }
    }

    public final void d0(JSONObject jSONObject, Boolean bool) {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ff9f2d", new Object[]{this, jSONObject, bool});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("arg1");
            String string2 = jSONObject.getString("page");
            try {
                i = Integer.parseInt(jSONObject.getString("eventId"));
            } catch (Exception unused) {
                i = 0;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            if (bool != null) {
                if (bool.booleanValue()) {
                    str = "1";
                } else {
                    str = "0";
                }
                jSONObject2.put("isOpen", (Object) str);
            }
            TBS.Ext.commitEvent(string2, i, string, null, null, suv.i(jSONObject2));
        }
    }
}
