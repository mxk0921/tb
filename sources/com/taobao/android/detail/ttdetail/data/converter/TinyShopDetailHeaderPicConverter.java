package com.taobao.android.detail.ttdetail.data.converter;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dkj;
import tb.t2o;
import tb.tx9;
import tb.wua;
import tb.xka;
import tb.y3l;
import tb.zlj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TinyShopDetailHeaderPicConverter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f6753a = "type";
    public static final String b = "fields";
    public static final String c = "events";
    public static final JSONObject d = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.1
        {
            put("native$headerbgimage", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.1.1
                {
                    put("name", dkj.NAME);
                    put("type", "native");
                    put("version", "0");
                    put("url", "");
                }
            });
        }
    };
    public static final JSONObject e = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.2
        {
            put("native$headervideo", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.2.1
                {
                    put("name", zlj.NAME);
                    put("type", "native");
                    put("version", "0");
                    put("url", "");
                }
            });
        }
    };

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return f6753a;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return c;
    }

    static {
        t2o.a(912261637);
    }

    public static boolean d(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a973a24b", new Object[]{jSONObject, jSONObject2, jSONObject3})).booleanValue();
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("item");
        if (jSONObject4 == null || jSONObject4.isEmpty()) {
            return false;
        }
        JSONArray jSONArray = jSONObject4.getJSONArray("images");
        JSONArray jSONArray2 = jSONObject4.getJSONArray("videos");
        if ((jSONArray == null || jSONArray.isEmpty()) && (jSONArray2 == null || jSONArray2.isEmpty())) {
            return false;
        }
        jSONObject2.putAll(d);
        jSONObject2.putAll(e);
        JSONObject jSONObject5 = new JSONObject();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        if (jSONArray2 != null && !jSONArray2.isEmpty()) {
            JSONObject jSONObject6 = new JSONObject();
            JSONArray jSONArray5 = new JSONArray();
            int size = jSONArray2.size();
            int i = 0;
            while (i < size) {
                JSONObject jSONObject7 = new JSONObject();
                final JSONObject jSONObject8 = jSONArray2.getJSONObject(i);
                jSONObject7.put("content", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.3
                    {
                        put(TinyShopDetailHeaderPicConverter.a(), "native$headervideo");
                        put(TinyShopDetailHeaderPicConverter.b(), (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.3.1
                            {
                                put("thumbnailUrl", (Object) JSONObject.this.getString("videoThumbnailURL"));
                                put("videoId", (Object) JSONObject.this.getString("videoId"));
                                put("videoUrl", (Object) JSONObject.this.getString("url"));
                            }
                        });
                        put(TinyShopDetailHeaderPicConverter.c(), (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.3.2
                            {
                                put("itemClick", (Object) new JSONArray() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.3.2.1
                                    {
                                        add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.3.2.1.1
                                            {
                                                put("type", y3l.EVENT_TYPE);
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
                jSONObject7.put("dimension", (Object) jSONObject8.getString("spatialVideoDimension"));
                jSONObject7.put(tx9.KEY_ENABLE_LIGHT_OFF, (Object) "true");
                jSONArray5.add(jSONObject7);
                i++;
                size = size;
                jSONArray2 = jSONArray2;
            }
            jSONArray3.add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.4
                {
                    put("id", "video");
                    put("name", "视频");
                }
            });
            jSONObject6.put("items", (Object) jSONArray5);
            jSONObject6.put(xka.KEY_LOCATOR_ID, (Object) "video");
            jSONArray4.add(jSONObject6);
        }
        if (jSONArray != null && !jSONArray.isEmpty()) {
            JSONObject jSONObject9 = new JSONObject();
            JSONArray jSONArray6 = new JSONArray();
            int i2 = 0;
            for (int size2 = jSONArray.size(); i2 < size2; size2 = size2) {
                JSONObject jSONObject10 = new JSONObject();
                final String string = jSONArray.getString(i2);
                jSONObject10.put("content", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.5
                    {
                        put(TinyShopDetailHeaderPicConverter.a(), "native$headerbgimage");
                        put(TinyShopDetailHeaderPicConverter.b(), (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.5.1
                            {
                                put("url", (Object) string);
                            }
                        });
                        put(TinyShopDetailHeaderPicConverter.c(), (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.5.2
                            {
                                put("itemClick", (Object) new JSONArray() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.5.2.1
                                    {
                                        add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.5.2.1.1
                                            {
                                                put("type", y3l.EVENT_TYPE);
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
                jSONObject10.put("dimension", (Object) "1:1");
                jSONObject10.put(tx9.KEY_ENABLE_LIGHT_OFF, (Object) "true");
                jSONArray6.add(jSONObject10);
                i2++;
            }
            jSONArray3.add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.6
                {
                    put("id", "image");
                    put("name", "图集");
                }
            });
            jSONObject9.put("items", (Object) jSONArray6);
            jSONObject9.put(xka.KEY_LOCATOR_ID, (Object) "image");
            jSONArray4.add(jSONObject9);
        }
        if (jSONArray4.isEmpty()) {
            return false;
        }
        jSONObject5.put(wua.KEY_LOCATORS, (Object) jSONArray3);
        jSONObject5.put("groups", (Object) jSONArray4);
        jSONObject3.put("headerPic", (Object) jSONObject5);
        return true;
    }
}
