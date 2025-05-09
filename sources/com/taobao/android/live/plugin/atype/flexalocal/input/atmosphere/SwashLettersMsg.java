package com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SwashLettersMsg implements INetDataObject {
    public String itemId;
    public String liveId;
    public String swashLettersAction;
    public SwashLettersDesc swashLettersDesc;
    public String swashLettersId;
    public int swashLettersType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class StaticResource implements INetDataObject {
        public String backgroundUrl;
        public float centerX;
        public float centerY;
        public float flexHeight;
        public float flexWidth;
        public String gravity;
        public int height;
        public int marginX;
        public int marginY;
        public String text;
        public float textSize;
        public int width;

        static {
            t2o.a(295699422);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class SwashLettersDesc implements INetDataObject {
        public long displayTime;
        public StaticResource staticResource;

        static {
            t2o.a(295699423);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(295699421);
        t2o.a(806355930);
    }
}
