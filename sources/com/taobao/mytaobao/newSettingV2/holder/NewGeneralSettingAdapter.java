package com.taobao.mytaobao.newSettingV2.holder;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.newSettingV2.data.NewGeneralSettingDataModel;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.List;
import tb.j9t;
import tb.l0d;
import tb.o32;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NewGeneralSettingAdapter extends RecyclerView.Adapter<NewGeneralSettingViewHolder> implements l0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LayoutInflater f11228a;
    public List<NewGeneralSettingDataModel> b;
    public l0d c;
    public o32<NewGeneralSettingDataModel> d;
    public final Context e;

    static {
        t2o.a(745537763);
        t2o.a(745537767);
    }

    public NewGeneralSettingAdapter(Context context) {
        this.f11228a = LayoutInflater.from(context);
        this.e = context;
    }

    public static /* synthetic */ Object ipc$super(NewGeneralSettingAdapter newGeneralSettingAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/newSettingV2/holder/NewGeneralSettingAdapter");
    }

    public int M(NewGeneralSettingDataModel newGeneralSettingDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40d360d7", new Object[]{this, newGeneralSettingDataModel})).intValue();
        }
        return this.b.indexOf(newGeneralSettingDataModel);
    }

    /* renamed from: O */
    public NewGeneralSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NewGeneralSettingViewHolder) ipChange.ipc$dispatch("c737c8ab", new Object[]{this, viewGroup, new Integer(i)});
        }
        return new NewGeneralSettingViewHolder(this.e, this.f11228a.inflate(R.layout.mytaobao_setting_general_item, viewGroup, false));
    }

    public void P(l0d l0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1660508d", new Object[]{this, l0dVar});
        } else {
            this.c = l0dVar;
        }
    }

    public void Q(List<NewGeneralSettingDataModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7305a55", new Object[]{this, list});
        } else {
            this.b = list;
        }
    }

    @Override // tb.l0d
    public void R(NewGeneralSettingDataModel newGeneralSettingDataModel, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e49b6c", new Object[]{this, newGeneralSettingDataModel, str, new Boolean(z)});
            return;
        }
        l0d l0dVar = this.c;
        if (l0dVar != null) {
            l0dVar.R(newGeneralSettingDataModel, str, z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<NewGeneralSettingDataModel> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: N */
    public void onBindViewHolder(NewGeneralSettingViewHolder newGeneralSettingViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d19638d", new Object[]{this, newGeneralSettingViewHolder, new Integer(i)});
            return;
        }
        NewGeneralSettingDataModel newGeneralSettingDataModel = this.b.get(i);
        if (newGeneralSettingDataModel.isShowDividerWithoutTitle) {
            newGeneralSettingViewHolder.c.setVisibility(8);
            newGeneralSettingViewHolder.f11229a.setVisibility(0);
        } else if (!TextUtils.isEmpty(newGeneralSettingDataModel.showDividerWithTitle)) {
            newGeneralSettingViewHolder.c.setVisibility(8);
            newGeneralSettingViewHolder.b.setVisibility(0);
            newGeneralSettingViewHolder.b.setText(newGeneralSettingDataModel.showDividerWithTitle);
        } else {
            newGeneralSettingViewHolder.c.setVisibility(0);
            newGeneralSettingViewHolder.f11229a.setVisibility(8);
            newGeneralSettingViewHolder.b.setVisibility(8);
        }
        newGeneralSettingViewHolder.d.setText(newGeneralSettingDataModel.title);
        if (!TextUtils.isEmpty(newGeneralSettingDataModel.desc)) {
            newGeneralSettingViewHolder.e.setVisibility(0);
            newGeneralSettingViewHolder.e.setText(newGeneralSettingDataModel.desc);
        }
        if ("switch".equalsIgnoreCase(newGeneralSettingDataModel.style)) {
            newGeneralSettingViewHolder.f.setVisibility(0);
            newGeneralSettingViewHolder.f.setChecked(newGeneralSettingDataModel.switchState);
            newGeneralSettingViewHolder.g.setVisibility(8);
        } else if (NewGeneralSettingDataModel.STYLE_PICKER_SWITCH.equalsIgnoreCase(newGeneralSettingDataModel.style)) {
            newGeneralSettingViewHolder.f.setVisibility(0);
            newGeneralSettingViewHolder.f.setChecked(newGeneralSettingDataModel.switchState);
            if (newGeneralSettingDataModel.switchState) {
                newGeneralSettingViewHolder.g.setVisibility(0);
                newGeneralSettingViewHolder.i.setVisibility(8);
                try {
                    JSONObject parseObject = JSON.parseObject((String) j9t.e(Globals.getApplication(), "mytaobao").b().d("mytaobao", newGeneralSettingDataModel.nativeKey + "Sub", "", null));
                    int intValue = parseObject.getInteger("startHour").intValue();
                    Integer integer = parseObject.getInteger("starMinute");
                    int intValue2 = integer.intValue();
                    int intValue3 = parseObject.getInteger("endHour").intValue();
                    Integer integer2 = parseObject.getInteger("endMinute");
                    int intValue4 = integer2.intValue();
                    StringBuilder sb = new StringBuilder();
                    sb.append(intValue);
                    sb.append(":");
                    String str = integer;
                    if (intValue2 < 10) {
                        str = "0" + intValue2;
                    }
                    sb.append(str);
                    sb.append("-");
                    sb.append(intValue3);
                    sb.append(":");
                    String str2 = integer2;
                    if (intValue4 < 10) {
                        str2 = "0" + intValue4;
                    }
                    sb.append(str2);
                    newGeneralSettingViewHolder.h.setText(sb.toString());
                } catch (Throwable unused) {
                    newGeneralSettingViewHolder.h.setText("0:00-0:00");
                }
            } else {
                newGeneralSettingViewHolder.g.setVisibility(8);
            }
        } else {
            newGeneralSettingViewHolder.f.setVisibility(8);
            newGeneralSettingViewHolder.g.setVisibility(0);
            newGeneralSettingViewHolder.i.setVisibility(0);
            newGeneralSettingViewHolder.h.setText(newGeneralSettingDataModel.rightTip);
        }
        newGeneralSettingViewHolder.h0(newGeneralSettingDataModel);
        newGeneralSettingViewHolder.g0(this);
        newGeneralSettingViewHolder.l = this.d;
    }
}
