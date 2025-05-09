package com.taobao.android.litecreator.util;

import com.alibaba.marvel.Viewer;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.ogh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MarvelFrameIntervalHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIGH_FRAME_INTERVAL_MS = 16;
    public static final int SCENE_IMAGE_EDIT = 2;
    public static final int SCENE_VIDEO_COVER_EDIT = 1;
    public static final int SCENE_VIDEO_EDIT = 0;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface SceneType {
    }

    static {
        t2o.a(511705630);
    }

    public static boolean a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddc84d65", new Object[]{new Float(f), new Float(f2)})).booleanValue();
        }
        if (f == -2.0f || f <= f2) {
            return false;
        }
        return true;
    }

    public static void b(Viewer viewer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2d04f0", new Object[]{viewer});
        } else if (viewer == null) {
            ogh.e("MarvelFrameIntervalHelper", "setHighFrame, Viewer is null.");
        } else {
            viewer.setFrameInterval(16);
            ogh.e("MarvelFrameIntervalHelper", "setHighFrame, success");
        }
    }

    public static void c(Viewer viewer, float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8faadcf", new Object[]{viewer, new Float(f), new Float(f2), new Integer(i)});
            return;
        }
        ogh.e("MarvelFrameIntervalHelper", "setHighFrameIfMetCondition, deviceScore = " + f + "，minHighFrameDeviceScore =" + f2);
        if (a(f, f2)) {
            b(viewer);
        }
    }
}
