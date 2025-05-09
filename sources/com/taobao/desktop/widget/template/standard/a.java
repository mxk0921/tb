package com.taobao.desktop.widget.template.standard;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.template.standard.WidgetStandardData;
import com.taobao.phenix.compat.effects.RoundedCornersBitmapProcessor;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cdx;
import tb.edx;
import tb.hgh;
import tb.o84;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a extends o84 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<Integer, Object> b;

    static {
        t2o.a(437256331);
    }

    public a(Context context) {
        this.f25208a = context;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/template/standard/WidgetStandardManager");
    }

    public void q(List<Integer> list, WidgetStandardData widgetStandardData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d622ad6", new Object[]{this, list, widgetStandardData});
        } else if (widgetStandardData != null) {
            try {
                v(widgetStandardData, list, widgetStandardData.getNextRefreshTime());
            } catch (Exception e) {
                Class<?> cls = getClass();
                hgh.c(cls, "notifyDataUpdate error" + e.getMessage());
                cdx.b("widget_catch_error", "WidgetLiveReceiver.notifyDataUpdate", e.getMessage(), null);
            }
        }
    }

    public void r(RemoteViews remoteViews, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9efd9", new Object[]{this, remoteViews, new Integer(i), str});
        } else if (!TextUtils.isEmpty(str)) {
            if (!this.b.containsKey(Integer.valueOf(i)) || !str.equals(this.b.get(Integer.valueOf(i)))) {
                this.b.put(Integer.valueOf(i), str);
            }
            o(remoteViews, i);
        } else {
            j(remoteViews, i);
        }
    }

    public final void s(RemoteViews remoteViews, WidgetStandardData.ExtData.ContainersData containersData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08fc359", new Object[]{this, remoteViews, containersData});
            return;
        }
        r(remoteViews, R.id.iv_widget_standard_contain_bg_left, containersData.getContentBgUrl());
        r(remoteViews, R.id.iv_widget_standard_contain_above_bg_left, containersData.getContentImageUrl());
        r(remoteViews, R.id.iv_widget_standard_contain_above_square_bg_left, containersData.getSquareContentImageUrl());
        r(remoteViews, R.id.iv_widget_standard_title_bg_left, containersData.getTitleBgUrl());
        int i = R.id.tv_widget_standard_title_left;
        m(remoteViews, i, containersData.getTitle());
        n(remoteViews, i, containersData.getTitleColor());
        r(remoteViews, R.id.iv_widget_standard_tag_bg_left, containersData.getTagBgUrl());
        int i2 = R.id.tv_widget_standard_tag_left;
        m(remoteViews, i2, containersData.getTag());
        n(remoteViews, i2, containersData.getTagColor());
        r(remoteViews, R.id.iv_widget_standard_corner_bg_left, containersData.getCollectBgUrl());
        int i3 = R.id.tv_widget_standard_corner_left;
        m(remoteViews, i3, containersData.getCollect());
        n(remoteViews, i3, containersData.getCollectColor());
        h(remoteViews, R.id.rl_widget_standard_contain_left, containersData.getDeepLink());
    }

    public final void t(RemoteViews remoteViews, WidgetStandardData.ExtData.ContainersData containersData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68dd5b1c", new Object[]{this, remoteViews, containersData});
            return;
        }
        r(remoteViews, R.id.iv_widget_standard_contain_bg_right, containersData.getContentBgUrl());
        r(remoteViews, R.id.iv_widget_standard_contain_above_bg_right, containersData.getContentImageUrl());
        r(remoteViews, R.id.iv_widget_standard_contain_above_square_bg_right, containersData.getSquareContentImageUrl());
        r(remoteViews, R.id.iv_widget_standard_title_bg_right, containersData.getTitleBgUrl());
        int i = R.id.tv_widget_standard_title_right;
        m(remoteViews, i, containersData.getTitle());
        n(remoteViews, i, containersData.getTitleColor());
        r(remoteViews, R.id.iv_widget_standard_tag_bg_right, containersData.getTagBgUrl());
        int i2 = R.id.tv_widget_standard_tag_right;
        m(remoteViews, i2, containersData.getTag());
        n(remoteViews, i2, containersData.getTagColor());
        r(remoteViews, R.id.iv_widget_standard_corner_bg_right, containersData.getCollectBgUrl());
        int i3 = R.id.tv_widget_standard_corner_right;
        m(remoteViews, i3, containersData.getCollect());
        n(remoteViews, i3, containersData.getCollectColor());
        h(remoteViews, R.id.rl_widget_standard_contain_right, containersData.getDeepLink());
    }

    public final void u(RemoteViews remoteViews, WidgetStandardData.ExtData.ContainersData containersData) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c716018a", new Object[]{this, remoteViews, containersData});
            return;
        }
        int i = R.id.iv_widget_standard_mark_tag_bg;
        j(remoteViews, i);
        r(remoteViews, i, containersData.getTagBgUrl());
        if (!TextUtils.isEmpty(containersData.getTagBgGradient()) && containersData.getTagBgGradient().contains("-")) {
            String[] split = containersData.getTagBgGradient().split("-");
            bitmap = e(split[0], split[1], containersData.getTag(), false);
        } else if (!TextUtils.isEmpty(containersData.getTagBgColor())) {
            bitmap = e(containersData.getTagBgColor(), containersData.getTagBgColor(), containersData.getTag(), false);
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            i(remoteViews, i, bitmap);
            o(remoteViews, i);
        }
        int i2 = R.id.tv_widget_standard_mark_tag;
        m(remoteViews, i2, containersData.getTag());
        n(remoteViews, i2, containersData.getTagColor());
        int i3 = R.id.tv_widget_standard_mark_title;
        m(remoteViews, i3, containersData.getTitle());
        n(remoteViews, i3, containersData.getTitleColor());
        int i4 = R.id.tv_widget_standard_mark_desc;
        m(remoteViews, i4, containersData.getDescription());
        n(remoteViews, i4, containersData.getDescriptionColor());
    }

    public final void v(WidgetStandardData widgetStandardData, List<Integer> list, long j) {
        WidgetStandardData.ExtData ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b3b6ee", new Object[]{this, widgetStandardData, list, new Long(j)});
            return;
        }
        Class<?> cls = getClass();
        hgh.c(cls, "updateAppWidget：appWidgetId: " + list + ",data: " + widgetStandardData);
        this.b = new HashMap(16);
        RemoteViews remoteViews = new RemoteViews(this.f25208a.getPackageName(), R.layout.widget_standard);
        r(remoteViews, R.id.iv_widget_standard_bg, widgetStandardData.getImageUrl());
        r(remoteViews, R.id.iv_widget_standard_above_bg, widgetStandardData.getOverlayImageUrl());
        r(remoteViews, R.id.iv_widget_standard_above_over_bg, widgetStandardData.getOverlayMaterialUrl());
        h(remoteViews, R.id.rl_widget_standard_container, widgetStandardData.getDeepLink());
        int i = R.id.rl_widget_standard_template_one;
        j(remoteViews, i);
        int i2 = R.id.rl_widget_standard_template_two;
        j(remoteViews, i2);
        int i3 = R.id.rl_widget_standard_contain_left;
        l(remoteViews, i3);
        int i4 = R.id.rl_widget_standard_contain_right;
        l(remoteViews, i4);
        if (!(widgetStandardData.getExt() == null || (ext = widgetStandardData.getExt()) == null || ext.getContainers() == null)) {
            List<WidgetStandardData.ExtData.ContainersData> containers = ext.getContainers();
            if (ext.getTemplateType() == 1) {
                o(remoteViews, i);
                if (containers.size() > 0 && containers.get(0) != null) {
                    o(remoteViews, i3);
                    s(remoteViews, containers.get(0));
                }
                if (containers.size() > 1 && containers.get(1) != null) {
                    o(remoteViews, i4);
                    t(remoteViews, containers.get(1));
                }
            } else if (ext.getTemplateType() == 2) {
                o(remoteViews, i2);
                if (containers.size() > 0 && containers.get(0) != null) {
                    u(remoteViews, containers.get(0));
                }
            }
        }
        p(remoteViews, list, j, this.b);
    }

    public final void p(RemoteViews remoteViews, List<Integer> list, long j, Map<Integer, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de15e60", new Object[]{this, remoteViews, list, new Long(j), map});
            return;
        }
        Class<?> cls = getClass();
        hgh.c(cls, "appWidgetId: " + list + "loadImage imgMap: " + map);
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            if (map.get(num) instanceof String) {
                if (intValue == R.id.iv_widget_standard_contain_above_square_bg_left || intValue == R.id.iv_widget_standard_contain_above_square_bg_right) {
                    f(remoteViews, intValue, (String) map.get(num), new RoundedCornersBitmapProcessor(edx.b(38.0f), edx.b(6.0f), edx.b(6.0f), 0), list, j, map);
                } else {
                    f(remoteViews, intValue, (String) map.get(num), null, list, j, map);
                }
            }
        }
    }
}
