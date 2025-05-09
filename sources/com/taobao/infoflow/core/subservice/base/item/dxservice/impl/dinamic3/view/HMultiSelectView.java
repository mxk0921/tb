package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import tb.fve;
import tb.j18;
import tb.ja6;
import tb.pb6;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class HMultiSelectView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEEDBACK_ROOT_USER_ID = "feedback_collection_root";
    private static final String KEY_IS_SELECT_ITEM = "isSelectItem";
    public static final String KEY_MULTI_SELECT_TEXT = "multiSelectText";
    private static final String SEPARATOR = ";";
    private static final String TAG = "HMultiSelectView";
    private int selectBackgroundColor;
    private int selectTextColor;
    private int unSelectBackgroundColor;
    private int unSelectTextColor;
    private final HashMap<TextView, Boolean> clickStatusMap = new HashMap<>();
    private boolean isBold = false;
    private double multiTextSize = 12.0d;
    private double buttonCornerRadius = 4.0d;
    private double itemHeight = 30.0d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseSectionModel f10633a;
        public final /* synthetic */ DXRootView b;

        public a(BaseSectionModel baseSectionModel, DXRootView dXRootView) {
            this.f10633a = baseSectionModel;
            this.b = dXRootView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                HMultiSelectView.access$000(HMultiSelectView.this, (TextView) view, this.f10633a, this.b);
            }
        }
    }

    static {
        t2o.a(486539410);
    }

    public HMultiSelectView(Context context) {
        super(context);
        init();
    }

    public static /* synthetic */ void access$000(HMultiSelectView hMultiSelectView, TextView textView, BaseSectionModel baseSectionModel, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb194ed", new Object[]{hMultiSelectView, textView, baseSectionModel, dXRootView});
        } else {
            hMultiSelectView.onClickItem(textView, baseSectionModel, dXRootView);
        }
    }

    private String addSelectItem(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e35c4c35", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str + ";" + str2;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            setOrientation(1);
        }
    }

    public static /* synthetic */ Object ipc$super(HMultiSelectView hMultiSelectView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/view/HMultiSelectView");
    }

    private String removeSelectItem(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("582d3572", new Object[]{this, str, str2});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split(";")));
        arrayList.remove(str2);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (sb.length() > 0) {
                sb.append(";");
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    private void setTextStyle(TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8edd99", new Object[]{this, textView, new Boolean(z)});
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (z) {
            gradientDrawable.setColor(this.selectBackgroundColor);
            textView.setTextColor(this.selectTextColor);
        } else {
            gradientDrawable.setColor(this.unSelectBackgroundColor);
            textView.setTextColor(this.unSelectTextColor);
        }
        if (this.buttonCornerRadius <= vu3.b.GEO_NOT_SUPPORT) {
            this.buttonCornerRadius = 4.0d;
        }
        gradientDrawable.setCornerRadius(pb6.c(getContext(), (float) this.buttonCornerRadius));
        textView.setBackground(gradientDrawable);
    }

    public void setCornerRadius(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c77d6e", new Object[]{this, new Double(d)});
        } else if (this.buttonCornerRadius > vu3.b.GEO_NOT_SUPPORT) {
            this.buttonCornerRadius = d;
        }
    }

    public void setIsBold(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81af4bfc", new Object[]{this, new Boolean(z)});
        } else {
            this.isBold = z;
        }
    }

    public void setItemHeight(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21779fb", new Object[]{this, new Double(d)});
        } else if (d > vu3.b.GEO_NOT_SUPPORT) {
            this.itemHeight = d;
        }
    }

    public void setItemList(JSONArray jSONArray, BaseSectionModel<?> baseSectionModel, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d88cb", new Object[]{this, jSONArray, baseSectionModel, dXRootView});
        } else if (jSONArray != null && jSONArray.size() != 0) {
            int c = pb6.c(getContext(), 8.0f);
            int c2 = pb6.c(getContext(), 8.0f);
            if (this.itemHeight <= vu3.b.GEO_NOT_SUPPORT) {
                this.itemHeight = 30.0d;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(pb6.c(getContext(), 155.0f), pb6.c(getContext(), (float) this.itemHeight));
            layoutParams.setMargins(c2, c, c2, 0);
            layoutParams.gravity = 1;
            for (int i = 0; i < jSONArray.size(); i++) {
                String string = jSONArray.getString(i);
                TextView textView = new TextView(getContext());
                if (this.isBold) {
                    textView.setTypeface(null, 1);
                }
                textView.setGravity(17);
                textView.setText(string);
                textView.setMaxLines(1);
                textView.setTextSize((float) this.multiTextSize);
                setTextStyle(textView, false);
                textView.setOnClickListener(new a(baseSectionModel, dXRootView));
                addView(textView, layoutParams);
            }
        }
    }

    public void setMultiTextSize(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19fd05d2", new Object[]{this, new Double(d)});
        } else if (d > vu3.b.GEO_NOT_SUPPORT) {
            this.multiTextSize = d;
        }
    }

    public void setSelectBackgroundColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b777e48", new Object[]{this, str});
        } else if (str == null) {
            this.selectBackgroundColor = Color.parseColor("#19FF6200");
        } else {
            try {
                this.selectBackgroundColor = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.selectBackgroundColor = Color.parseColor("#19FF6200");
                fve.e(TAG, "parse select Background color failed");
            }
        }
    }

    public void setSelectTextColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faffa869", new Object[]{this, str});
        } else if (str == null) {
            this.selectTextColor = Color.parseColor("FF6200");
        } else {
            try {
                this.selectTextColor = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.selectTextColor = Color.parseColor("FF6200");
                fve.e(TAG, "parse select color failed");
            }
        }
    }

    public void setUnSelectBackgroundColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8903a6f", new Object[]{this, str});
        } else if (str == null) {
            this.unSelectBackgroundColor = Color.parseColor("#F3F6F8");
        } else {
            try {
                this.unSelectBackgroundColor = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.unSelectBackgroundColor = Color.parseColor("#F3F6F8");
                fve.e(TAG, "parse select Background color failed");
            }
        }
    }

    public void setUnSelectTextColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c64dd0", new Object[]{this, str});
        } else if (str == null) {
            this.unSelectTextColor = Color.parseColor("#111111");
        } else {
            try {
                this.unSelectTextColor = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.unSelectTextColor = Color.parseColor("#111111");
                fve.e(TAG, "parse Unselect color failed");
            }
        }
    }

    private void onClickItem(TextView textView, BaseSectionModel<?> baseSectionModel, DXRootView dXRootView) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("649d3cca", new Object[]{this, textView, baseSectionModel, dXRootView});
        } else if (textView != null && baseSectionModel != null) {
            Boolean bool = this.clickStatusMap.get(textView);
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            String b = j18.b(baseSectionModel, KEY_MULTI_SELECT_TEXT);
            if (bool.booleanValue()) {
                setTextStyle(textView, false);
                if (TextUtils.isEmpty(b)) {
                    str = "";
                } else {
                    str = removeSelectItem(b, textView.getText().toString());
                }
            } else {
                setTextStyle(textView, true);
                if (TextUtils.isEmpty(b)) {
                    str = textView.getText().toString();
                } else {
                    str = addSelectItem(b, textView.getText().toString());
                }
            }
            if (TextUtils.isEmpty(str)) {
                j18.f(baseSectionModel, KEY_IS_SELECT_ITEM, "false");
            } else {
                j18.f(baseSectionModel, KEY_IS_SELECT_ITEM, "true");
            }
            j18.f(baseSectionModel, KEY_MULTI_SELECT_TEXT, str);
            ja6.b(FEEDBACK_ROOT_USER_ID, dXRootView);
            this.clickStatusMap.put(textView, Boolean.valueOf(!bool.booleanValue()));
        }
    }

    public HMultiSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public HMultiSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
