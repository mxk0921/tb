package com.taobao.android.detail.ttdetail.transfer.widget.adaptive;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeTextView;
import java.util.ArrayList;
import java.util.Iterator;
import tb.owo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class XAdaptiveTextViewV3 extends DXNativeTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean hasMore;
    private Context mContext;
    private int maxLen;
    private String separator;
    private int width;
    private String xEllipsis = "...";
    private ArrayList<String> data = new ArrayList<>();

    static {
        t2o.a(912262724);
    }

    public XAdaptiveTextViewV3(Context context) {
        super(context);
        this.mContext = context;
    }

    private int getWidth(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc81c61e", new Object[]{this, str, str2})).intValue();
        }
        int e = owo.e(this.mContext, str, 375);
        if (str2 != null) {
            return owo.e(this.mContext, str2, 375);
        }
        return e;
    }

    public static /* synthetic */ Object ipc$super(XAdaptiveTextViewV3 xAdaptiveTextViewV3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/adaptive/XAdaptiveTextViewV3");
    }

    private boolean isMaxLen(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12411ac6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i2 == 0 || i < i2) {
            return false;
        }
        return true;
    }

    private void loadData(ArrayList<String> arrayList, JSONArray jSONArray, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d74e05", new Object[]{this, arrayList, jSONArray, str});
            return;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            if (!TextUtils.isEmpty(str)) {
                Object obj = jSONObject.get(str);
                if (obj == null) {
                    continue;
                } else {
                    String obj2 = obj.toString();
                    if (!TextUtils.isEmpty(obj2)) {
                        arrayList.add(obj2);
                        i++;
                    }
                    if (isMaxLen(i, this.maxLen)) {
                        this.hasMore = true;
                        return;
                    }
                }
            } else {
                for (String str2 : jSONObject.keySet()) {
                    if (isMaxLen(i, this.maxLen)) {
                        this.hasMore = true;
                        return;
                    } else if (!TextUtils.isEmpty(str2)) {
                        arrayList.add(str2);
                        i++;
                    }
                }
                continue;
            }
        }
    }

    private String parseData() {
        float f;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ea321c", new Object[]{this});
        }
        String str = "";
        while (true) {
            if (i >= this.data.size()) {
                break;
            }
            if (i == 0) {
                str = str + this.data.get(i);
            } else {
                str = str + this.separator + this.data.get(i);
            }
            if (!this.hasMore) {
                f = getTextViewLength(this, str);
            } else {
                f = getTextViewLength(this, str + this.xEllipsis);
            }
            if (f <= this.width) {
                i++;
            } else if (i == 0) {
                str = this.data.get(i);
            } else {
                str = str;
            }
        }
        if (!this.hasMore) {
            return str;
        }
        return str + this.xEllipsis;
    }

    public float getTextViewLength(TextView textView, String str) {
        TextPaint paint;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac5a8669", new Object[]{this, textView, str})).floatValue();
        }
        if (textView == null || TextUtils.isEmpty(str) || (paint = textView.getPaint()) == null) {
            return -1.0f;
        }
        return paint.measureText(str);
    }

    public void setViewAttr(String str, String str2, JSONArray jSONArray, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c3e3123", new Object[]{this, str, str2, jSONArray, str3, str4, str5, str6});
        } else if (jSONArray != null) {
            this.separator = str4;
            if (!TextUtils.isEmpty(str6)) {
                this.xEllipsis = str6;
            }
            this.data.clear();
            this.maxLen = 0;
            this.hasMore = false;
            if (str5 != null) {
                try {
                    this.maxLen = Integer.parseInt(str5);
                } catch (Exception unused) {
                    this.maxLen = 0;
                }
            }
            loadData(this.data, jSONArray, str3);
            this.width = getWidth(str, str2);
            setText(parseData());
        }
    }

    public XAdaptiveTextViewV3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
    }
}
