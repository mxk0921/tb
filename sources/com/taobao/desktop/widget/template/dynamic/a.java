package com.taobao.desktop.widget.template.dynamic;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.ditto.data.WidgetContentData;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.wireless.link.widget.dynamic.WidgetDynamicReceiver;
import java.util.List;
import tb.cdx;
import tb.hgh;
import tb.o84;
import tb.s0m;
import tb.s8d;
import tb.sde;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a extends o84 implements sde {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.desktop.widget.template.dynamic.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class C0550a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RemoteViews f10333a;
        public final /* synthetic */ List b;
        public final /* synthetic */ long c;

        public C0550a(RemoteViews remoteViews, List list, long j) {
            this.f10333a = remoteViews;
            this.b = list;
            this.c = j;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            try {
                a.this.i(this.f10333a, R.id.iv_widget_dynamic_icon, succPhenixEvent.getDrawable().getBitmap());
                a.this.p(this.f10333a, this.b, this.c);
            } catch (Exception e) {
                hgh.c(C0550a.class, "loadImage error：" + e.getMessage());
            }
            return false;
        }
    }

    static {
        t2o.a(437256312);
        t2o.a(437256225);
    }

    public a(Context context) {
        this.f25208a = context;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/template/dynamic/WidgetDynamicManager");
    }

    @Override // tb.sde
    public void a(String str, List<Integer> list, String str2) {
        WidgetDynamicData widgetDynamicData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4bb0808", new Object[]{this, str, list, str2});
            return;
        }
        try {
            if (WidgetDynamicReceiver.class.getName().equals(str) && (widgetDynamicData = (WidgetDynamicData) JSON.parseObject(String.valueOf(str2), WidgetDynamicData.class)) != null) {
                q(widgetDynamicData, list, widgetDynamicData.getNextRefreshTime());
            }
        } catch (Exception e) {
            Class<?> cls = getClass();
            hgh.c(cls, "notifyDataUpdate error" + e.getMessage());
            cdx.b("widget_catch_error", "WidgetDynamicReceiver.notifyDataUpdate", e.getMessage(), null);
        }
    }

    @Override // tb.sde
    public void b(String str, List<Integer> list, WidgetContentData widgetContentData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0805fde", new Object[]{this, str, list, widgetContentData});
        }
    }

    public void p(RemoteViews remoteViews, List<Integer> list, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f3a40a", new Object[]{this, remoteViews, list, new Long(j)});
            return;
        }
        c(remoteViews, list, j);
        Class<?> cls = getClass();
        hgh.c(cls, "hasLoad widgetId：" + list);
    }

    public final void q(WidgetDynamicData widgetDynamicData, List<Integer> list, long j) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7996ad06", new Object[]{this, widgetDynamicData, list, new Long(j)});
            return;
        }
        Class<?> cls = getClass();
        hgh.c(cls, "updateAppWidget：appWidgetId: " + list + ",data: " + widgetDynamicData);
        String string = this.f25208a.getString(R.string.tao_app_widget_dynamic);
        String str3 = "";
        if (widgetDynamicData == null || widgetDynamicData.getExt() == null) {
            str2 = str3;
            str = str2;
        } else {
            if (!TextUtils.isEmpty(widgetDynamicData.getExt().getTitle())) {
                string = widgetDynamicData.getExt().getTitle();
            }
            str2 = !TextUtils.isEmpty(widgetDynamicData.getDeepLink()) ? widgetDynamicData.getDeepLink() : str3;
            str = !TextUtils.isEmpty(widgetDynamicData.getImageUrl()) ? widgetDynamicData.getImageUrl() : str3;
            if (!TextUtils.isEmpty(widgetDynamicData.getExt().getCollect())) {
                str3 = widgetDynamicData.getExt().getCollect();
            }
        }
        RemoteViews remoteViews = new RemoteViews(this.f25208a.getPackageName(), R.layout.widget_dynamic);
        remoteViews.setTextViewText(R.id.tv_widget_dynamic_name, string);
        if (!TextUtils.isEmpty(str3)) {
            int i = R.id.tv_widget_dynamic_count;
            remoteViews.setViewVisibility(i, 0);
            remoteViews.setTextViewText(i, str3);
        } else {
            remoteViews.setViewVisibility(R.id.tv_widget_dynamic_count, 8);
        }
        h(remoteViews, R.id.iv_widget_dynamic_icon, str2);
        if (TextUtils.isEmpty(str)) {
            p(remoteViews, list, j);
        } else {
            s0m.B().N0(this.f25208a).T(str).succListener(new C0550a(remoteViews, list, j)).fetch();
        }
    }
}
