package com.alibaba.android.icart.core.promotionsubmit.event;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class BaseEvent implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DOLLAR_PLACE_HOLDER = "\\$\\{(\\w*)\\}";
    public Context context;
    public JSONObject eventParams;
    public String eventType;
    public a finishedListener;
    public boolean isModalBuy;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    static {
        t2o.a(479199540);
    }

    public List<String> catchPlaceHolder(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6bcf52be", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile(DOLLAR_PLACE_HOLDER).matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(matcher.group(1));
        }
        return arrayList;
    }

    public abstract BaseEvent initEvent();

    public abstract void runEvent(Context context, JSONObject jSONObject);

    public BaseEvent setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseEvent) ipChange.ipc$dispatch("80df2bda", new Object[]{this, context});
        }
        this.context = context;
        return this;
    }

    public BaseEvent setFinishedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseEvent) ipChange.ipc$dispatch("6c84d751", new Object[]{this, aVar});
        }
        this.finishedListener = aVar;
        return this;
    }

    public BaseEvent setModalBuy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseEvent) ipChange.ipc$dispatch("2d51087c", new Object[]{this, new Boolean(z)});
        }
        this.isModalBuy = z;
        return this;
    }
}
