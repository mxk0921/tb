package com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.SwashLettersMsg;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.hw0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class EffectResPosition implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean alignBottom;
    public boolean alignRight;
    public int height;
    public int marginX;
    public int marginY;
    public int width;

    static {
        t2o.a(295699419);
        t2o.a(806355930);
    }

    public static EffectResPosition convertToPosition(Context context, EffectResConfig effectResConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EffectResPosition) ipChange.ipc$dispatch("98f2dafb", new Object[]{context, effectResConfig});
        }
        if (context == null || effectResConfig == null) {
            return null;
        }
        EffectResPosition effectResPosition = new EffectResPosition();
        float f = effectResConfig.flexWidth;
        if (f > 0.0f) {
            int i = (int) ((f * hw0.i()) + 0.5f);
            effectResPosition.width = i;
            effectResPosition.height = (i * effectResConfig.height) / effectResConfig.width;
        } else {
            float f2 = effectResConfig.flexHeight;
            if (f2 > 0.0f) {
                int f3 = (int) ((f2 * hw0.f()) + 0.5f);
                effectResPosition.height = f3;
                effectResPosition.width = (f3 * effectResConfig.width) / effectResConfig.height;
            } else {
                effectResPosition.width = hw0.b(context, effectResConfig.width);
                effectResPosition.height = hw0.b(context, effectResConfig.height);
            }
        }
        String str = effectResConfig.gravity;
        if (str != null) {
            if (str.contains("right")) {
                effectResPosition.alignRight = true;
            }
            if (effectResConfig.gravity.contains("bottom")) {
                effectResPosition.alignBottom = true;
            }
            if (effectResConfig.gravity.contains("centerX")) {
                effectResPosition.marginX = (int) (((effectResConfig.centerX * hw0.i()) - (effectResPosition.width / 2.0f)) + 0.5f);
            } else {
                effectResPosition.marginX = hw0.b(context, effectResConfig.marginX);
            }
            if (effectResConfig.gravity.contains("centerY")) {
                effectResPosition.marginY = (int) (((effectResConfig.centerY * hw0.f()) - (effectResPosition.height / 2.0f)) + 0.5f);
            } else {
                effectResPosition.marginY = hw0.b(context, effectResConfig.marginY);
            }
        }
        return effectResPosition;
    }

    public static EffectResPosition convertToPosition(Context context, SwashLettersMsg.StaticResource staticResource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EffectResPosition) ipChange.ipc$dispatch("5c3fa068", new Object[]{context, staticResource});
        }
        if (staticResource == null) {
            return null;
        }
        EffectResConfig effectResConfig = new EffectResConfig();
        effectResConfig.width = staticResource.width;
        effectResConfig.height = staticResource.height;
        effectResConfig.flexWidth = staticResource.flexWidth;
        effectResConfig.flexHeight = staticResource.flexHeight;
        effectResConfig.gravity = staticResource.gravity;
        effectResConfig.marginX = staticResource.marginX;
        effectResConfig.marginY = staticResource.marginY;
        effectResConfig.centerX = staticResource.centerX;
        effectResConfig.centerY = staticResource.centerY;
        return convertToPosition(context, effectResConfig);
    }
}
