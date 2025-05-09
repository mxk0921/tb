package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.detail.rate.RateFeedsFragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class rp5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f27526a = "photo";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a8651557", new Object[]{this})).longValue();
            }
            return rp5.h();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static /* synthetic */ JSONArray d(rp5 rp5Var, JSONObject jSONObject, JSONArray jSONArray, int i, JSONArray jSONArray2, JSONObject jSONObject2, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("f73acb1d", new Object[]{rp5Var, jSONObject, jSONArray, new Integer(i), jSONArray2, jSONObject2, new Integer(i2), obj});
        }
        if ((i2 & 16) != 0) {
            jSONObject2 = null;
        }
        return rp5Var.c(jSONObject, jSONArray, i, jSONArray2, jSONObject2);
    }

    public static /* synthetic */ JSONObject f(rp5 rp5Var, JSONObject jSONObject, JSONObject jSONObject2, int i, JSONObject jSONObject3, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("daa244f", new Object[]{rp5Var, jSONObject, jSONObject2, new Integer(i), jSONObject3, new Integer(i2), obj});
        }
        if ((i2 & 8) != 0) {
            jSONObject3 = null;
        }
        return rp5Var.e(jSONObject, jSONObject2, i, jSONObject3);
    }

    public static final /* synthetic */ long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480fb9f0", new Object[0])).longValue();
        }
        return -3446773587771465578L;
    }

    public static /* synthetic */ Object ipc$super(rp5 rp5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserRateListDataParser");
    }

    public final JSONObject e(JSONObject jSONObject, JSONObject jSONObject2, int i, JSONObject jSONObject3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8d151a0b", new Object[]{this, jSONObject, jSONObject2, new Integer(i), jSONObject3});
        }
        JSONObject jSONObject4 = new JSONObject();
        if (jSONObject2.get("videoId") == null || !ckf.b(jSONObject2.get("status"), "1")) {
            return null;
        }
        Object obj = jSONObject2.get("videoId");
        Object obj2 = "";
        if (obj == null) {
            obj = obj2;
        }
        jSONObject4.put((JSONObject) "videoId", (String) obj);
        Object obj3 = jSONObject2.get("cloudVideoUrl");
        if (obj3 == null && (obj3 = jSONObject2.get("sourceVideoUrl")) == null) {
            obj3 = obj2;
        }
        jSONObject4.put((JSONObject) "videoUrl", (String) obj3);
        Object obj4 = jSONObject2.get(tep.KEY_TP_RETURN_VIDEO_COVER_CDN_URL);
        if (obj4 != null) {
            obj2 = obj4;
        }
        jSONObject4.put((JSONObject) "picUrl", (String) obj2);
        Object obj5 = jSONObject2.get("spmCnt");
        if (obj5 == null) {
            obj5 = RateFeedsFragment.Companion.a();
        }
        jSONObject4.put((JSONObject) "spmCnt", (String) obj5);
        jSONObject4.put((JSONObject) "bizCode", "baobeipingjia");
        if (jSONObject2.get("width") != null) {
            jSONObject4.put((JSONObject) "width", (String) jSONObject2.get("width"));
        }
        if (jSONObject2.get("height") != null) {
            jSONObject4.put((JSONObject) "height", (String) jSONObject2.get("height"));
        }
        JSONObject b = b(jSONObject, i, jSONObject3);
        if (b != null) {
            b.put((JSONObject) "video", (String) jSONObject4);
        }
        return b;
    }

    public final JSONObject b(JSONObject jSONObject, int i, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fd5acd3b", new Object[]{this, jSONObject, new Integer(i), jSONObject2});
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "commentNamespace", "10000");
        jSONObject3.put((JSONObject) "cLikeNamespace", "1000");
        jSONObject3.put((JSONObject) "pLikeNamespace", "1321");
        jSONObject3.put((JSONObject) "vLikeNamespace", "1322");
        jSONObject3.put((JSONObject) "browseNamespace", "9000");
        JSONObject jSONObject4 = new JSONObject();
        Object obj = jSONObject.get("userNick");
        if (obj == null) {
            obj = jSONObject2 != null ? jSONObject2.get("userNick") : null;
        }
        Object obj2 = "";
        if (obj == null) {
            obj = obj2;
        }
        jSONObject4.put((JSONObject) "nick", (String) obj);
        Object obj3 = jSONObject.get("headPicUrl");
        if (obj3 == null) {
            obj3 = obj2;
        }
        jSONObject4.put((JSONObject) "iconUrl", (String) obj3);
        Object obj4 = jSONObject.get("userIndexURL");
        if (obj4 == null) {
            obj4 = obj2;
        }
        jSONObject4.put((JSONObject) "detailUrl", (String) obj4);
        jSONObject3.put((JSONObject) Constants.KEY_USER_ID, (String) jSONObject4);
        Object obj5 = jSONObject.get("id");
        if (obj5 == null) {
            obj5 = obj2;
        }
        jSONObject3.put((JSONObject) hxj.UNIQID, (String) obj5);
        Object obj6 = jSONObject.get("id");
        if (obj6 == null) {
            obj6 = obj2;
        }
        jSONObject3.put((JSONObject) "contentId", (String) obj6);
        Object obj7 = jSONObject.get("repeatBusiness");
        if (obj7 == null) {
            obj7 = obj2;
        }
        jSONObject3.put((JSONObject) "repeatBusiness", (String) obj7);
        jSONObject3.put((JSONObject) "orderIndex", (String) Integer.valueOf(i + 1));
        Object obj8 = jSONObject.get("feedback");
        if (obj8 == null) {
            obj8 = jSONObject.get("appendedFeedback");
        }
        if (obj8 == null) {
            obj8 = obj2;
        }
        jSONObject3.put((JSONObject) "content", (String) obj8);
        Object obj9 = jSONObject.get("feedbackTitle");
        if (obj9 == null) {
            obj9 = jSONObject.get("appendedFeedbackTitle");
        }
        if (obj9 == null) {
            obj9 = obj2;
        }
        jSONObject3.put((JSONObject) "contentTitle", (String) obj9);
        Object obj10 = jSONObject.get("rateSearchParam");
        if (obj10 == null) {
            obj10 = obj2;
        }
        jSONObject3.put((JSONObject) "rateSearchParam", (String) obj10);
        if (jSONObject.get("skuMap") != null) {
            jSONObject3.put((JSONObject) "skuMap", (String) jSONObject.get("skuMap"));
        }
        if (jSONObject.get("hasDetail") != null) {
            Object obj11 = jSONObject.get("share");
            if (obj11 != null) {
                jSONObject3.put((JSONObject) "detailUrl", (String) ((JSONObject) obj11).get("shareURL"));
                Object obj12 = jSONObject.get("share");
                if (obj12 != null) {
                    Object obj13 = ((JSONObject) obj12).get("detailUrl");
                    if (obj13 != null) {
                        jSONObject3.put((JSONObject) "newDetailUrl", (String) obj13);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
        }
        if (jSONObject.get("commentUrl") != null) {
            jSONObject3.put((JSONObject) "commentUrl", (String) jSONObject.get("commentUrl"));
        }
        if (jSONObject.get("interactInfo") != null) {
            Object obj14 = jSONObject.get("interactInfo");
            if (obj14 != null) {
                JSONObject jSONObject5 = (JSONObject) obj14;
                JSONObject jSONObject6 = new JSONObject();
                Object obj15 = jSONObject5.get("commentCount");
                if (obj15 != null) {
                    obj2 = obj15;
                }
                jSONObject6.put((JSONObject) "commentCount", (String) obj2);
                int i2 = jSONObject5.get("likeCount");
                if (i2 == null) {
                    i2 = 0;
                }
                jSONObject6.put((JSONObject) "likeCount", (String) i2);
                Object obj16 = jSONObject5.get("alreadyLike");
                if (obj16 == null) {
                    obj16 = Boolean.FALSE;
                }
                jSONObject6.put((JSONObject) "alreadyLike", (String) obj16);
                jSONObject3.put((JSONObject) "contentInteract", (String) jSONObject6);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
        }
        if (jSONObject.get("userTag") != null) {
            jSONObject3.put((JSONObject) "userTag", (String) jSONObject.get("userTag"));
        }
        return jSONObject3;
    }

    public final JSONArray c(JSONObject jSONObject, JSONArray jSONArray, int i, JSONArray jSONArray2, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("26b3e8a3", new Object[]{this, jSONObject, jSONArray, new Integer(i), jSONArray2, jSONObject2});
        }
        int size = jSONArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
            if (jSONObject3 != null) {
                JSONObject jSONObject4 = new JSONObject();
                Object obj = jSONObject3.get("thumbnail");
                if (obj == null) {
                    obj = "";
                }
                jSONObject4.put((JSONObject) "picUrl", (String) obj);
                if (jSONObject3.get(tep.KEY_TP_RETURN_VIDEO_FILE_ID) != null) {
                    jSONObject4.put((JSONObject) tep.KEY_TP_RETURN_VIDEO_FILE_ID, (String) jSONObject3.get(tep.KEY_TP_RETURN_VIDEO_FILE_ID));
                }
                if (jSONObject3.get("width") != null) {
                    jSONObject4.put((JSONObject) "width", (String) jSONObject3.get("width"));
                }
                if (jSONObject3.get("height") != null) {
                    jSONObject4.put((JSONObject) "height", (String) jSONObject3.get("height"));
                }
                JSONObject b = b(jSONObject, i, jSONObject2);
                if (b != null) {
                    b.put((JSONObject) "pic", (String) jSONObject4);
                }
                jSONArray2.add(b);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
        }
        return jSONArray2;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        Object obj = objArr[0];
        if (obj != null) {
            JSONArray jSONArray = (JSONArray) obj;
            Object obj2 = objArr[1];
            if (obj2 != null) {
                String str = (String) obj2;
                Object obj3 = objArr[2];
                if (obj3 != null) {
                    int parseInt = Integer.parseInt((String) obj3);
                    Object obj4 = objArr[3];
                    if (obj4 != null) {
                        int parseInt2 = Integer.parseInt((String) obj4);
                        if (!ckf.b(str, this.f27526a)) {
                            return null;
                        }
                        try {
                            return g(jSONArray, parseInt, parseInt2);
                        } catch (Exception unused) {
                            return null;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
        }
    }

    public final JSONArray g(JSONArray jSONArray, int i, int i2) {
        int i3;
        Object obj;
        String str;
        String str2;
        JSONArray jSONArray2;
        int i4;
        JSONArray jSONArray3 = jSONArray;
        int i5 = i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("2a2b61a0", new Object[]{this, jSONArray3, new Integer(i5), new Integer(i2)});
        }
        ckf.g(jSONArray3, "sourceData");
        JSONArray jSONArray4 = new JSONArray();
        int size = jSONArray.size();
        JSONArray jSONArray5 = jSONArray4;
        int i6 = 0;
        while (i6 < size) {
            JSONObject jSONObject = jSONArray3.getJSONObject(i6);
            if (jSONObject != null) {
                int i7 = i6 + ((i5 - 1) * i2);
                if (jSONObject.get("video") != null) {
                    Object obj2 = jSONObject.get("video");
                    if (obj2 != null) {
                        obj = "video";
                        i3 = i7;
                        str = "null cannot be cast to non-null type com.alibaba.fastjson.JSONObject";
                        jSONArray5.add(f(this, jSONObject, (JSONObject) obj2, i7, null, 8, null));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                    }
                } else {
                    obj = "video";
                    i3 = i7;
                    str = "null cannot be cast to non-null type com.alibaba.fastjson.JSONObject";
                }
                if (jSONObject.get("feedPicList") != null) {
                    Object obj3 = jSONObject.get("feedPicList");
                    if (obj3 != null) {
                        str2 = "null cannot be cast to non-null type com.alibaba.fastjson.JSONArray";
                        jSONArray2 = d(this, jSONObject, (JSONArray) obj3, i3, jSONArray5, null, 16, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
                    }
                } else {
                    str2 = "null cannot be cast to non-null type com.alibaba.fastjson.JSONArray";
                    jSONArray2 = jSONArray5;
                }
                if (jSONObject.get("appendedFeed") != null) {
                    Object obj4 = jSONObject.get("appendedFeed");
                    if (obj4 != null) {
                        JSONObject jSONObject2 = (JSONObject) obj4;
                        if (jSONObject2.get(obj) != null) {
                            Object obj5 = jSONObject2.get(obj);
                            if (obj5 != null) {
                                i4 = i3;
                                jSONArray2.add(e(jSONObject2, (JSONObject) obj5, i4, jSONObject));
                            } else {
                                throw new NullPointerException(str);
                            }
                        } else {
                            i4 = i3;
                        }
                        if (jSONObject2.get("appendFeedPicList") != null) {
                            Object obj6 = jSONObject2.get("appendFeedPicList");
                            if (obj6 != null) {
                                jSONArray5 = c(jSONObject2, (JSONArray) obj6, i4, jSONArray2, jSONObject);
                                i6++;
                                jSONArray3 = jSONArray;
                                i5 = i;
                            } else {
                                throw new NullPointerException(str2);
                            }
                        }
                    } else {
                        throw new NullPointerException(str);
                    }
                }
                jSONArray5 = jSONArray2;
                i6++;
                jSONArray3 = jSONArray;
                i5 = i;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
        }
        return jSONArray5;
    }
}
