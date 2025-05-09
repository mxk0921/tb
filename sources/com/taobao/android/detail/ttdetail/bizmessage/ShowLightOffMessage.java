package com.taobao.android.detail.ttdetail.bizmessage;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.ux1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ShowLightOffMessage extends ux1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Source b;
    public final String c;
    public final Rect d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum Source {
        MINI_VIDEO,
        VIDEO_COMPONENT,
        IMAGE_COMPONENT,
        UNKNOWN;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Source source, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/bizmessage/ShowLightOffMessage$Source");
        }

        public static Source valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Source) ipChange.ipc$dispatch("180d5d36", new Object[]{str});
            }
            return (Source) Enum.valueOf(Source.class, str);
        }
    }

    static {
        t2o.a(912261330);
    }

    public ShowLightOffMessage(Source source, String str, Rect rect) {
        this.b = source;
        this.c = str;
        this.d = rect;
    }

    public static /* synthetic */ Object ipc$super(ShowLightOffMessage showLightOffMessage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/bizmessage/ShowLightOffMessage");
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5df1a77", new Object[]{this});
        }
        return this.c;
    }

    public Rect b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("e95f3fb4", new Object[]{this});
        }
        return this.d;
    }

    public Source c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Source) ipChange.ipc$dispatch("2dbc80b7", new Object[]{this});
        }
        return this.b;
    }
}
