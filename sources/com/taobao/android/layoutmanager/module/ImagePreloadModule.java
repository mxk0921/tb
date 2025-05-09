package com.taobao.android.layoutmanager.module;

import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.weex.common.Constants;
import tb.nwv;
import tb.od0;
import tb.s6o;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ImagePreloadModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements ImageLoader.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoadFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3feabda6", new Object[]{this});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoaded(BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
            }
        }
    }

    static {
        t2o.a(502268102);
        t2o.a(503316559);
    }

    public static void preload(d.j jVar) {
        int i;
        int i2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eac76a3", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            nwv.I(((JSONObject) json).get("bizname"), null);
            JSONArray m = nwv.m(((JSONObject) jVar.b).get("imglist"), null);
            if (m != null) {
                for (int i3 = 0; i3 < m.size(); i3++) {
                    JSONObject jSONObject = m.getJSONObject(i3);
                    if (jSONObject != null) {
                        String string = jSONObject.getString("url");
                        if (!TextUtils.isEmpty(string)) {
                            int S = s6o.S(jVar.c(), nwv.t(jSONObject.get("viewWidth"), -1));
                            int S2 = s6o.S(jVar.c(), nwv.t(jSONObject.get(Constants.Name.VIEW_HEIGHT), -1));
                            int i4 = nwv.o(jSONObject.get("webp"), false) ? 4 : 0;
                            ImageLoader a2 = od0.D().a();
                            if (S <= 0 || S2 <= 0) {
                                str = string;
                                i2 = -1;
                                i = -1;
                            } else {
                                i2 = S;
                                i = S2;
                                str = a2.b(string, S, S2, ImageLoader.b.b(i4, "", "", "preload"));
                            }
                            a2.d(new ImageLoader.c(jVar.f11976a, jVar.c(), string, str, i2, i, ImageLoader.b.b(i4, "", "", "preload"), true), true, new a());
                        }
                    }
                }
            }
        }
    }
}
