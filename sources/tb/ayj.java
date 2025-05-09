package tb;

import android.text.TextUtils;
import anet.channel.status.NetworkStatusHelper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import tb.hsm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ayj implements mmc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Queue<String> f16075a = new LinkedList();
    public boolean b = false;

    static {
        t2o.a(352321810);
    }

    @Override // tb.mmc
    public void a(PreloadTaskEntity preloadTaskEntity) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("759e161d", new Object[]{this, preloadTaskEntity});
            return;
        }
        try {
            NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
            if (status == null) {
                txj.e(txj.TAG_RENDER, "NewDetailOnLoadHandler无法读取网络状态。");
            } else {
                z = status.isWifi();
            }
            Iterator<PreloadTaskEntity.a> it = preloadTaskEntity.items.iterator();
            while (it.hasNext()) {
                PreloadTaskEntity.a next = it.next();
                if (next != null) {
                    JSONObject jSONObject = next.h;
                    if (jSONObject != null) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("mainPicNative");
                        if (jSONObject2 != null) {
                            if (!this.b) {
                                ArrayList<String> B = byj.B();
                                if (B.size() > 0) {
                                    yox.n(B);
                                    txj.e(txj.TAG_RENDER, "NewDetailOnLoadHandler 加载zcache");
                                }
                                this.b = true;
                            }
                            if ("video".equals(jSONObject2.getString("type"))) {
                                if (!z) {
                                    txj.e(txj.TAG_RENDER, "NewDetailOnLoadHandler 非wifi状态，无需加载视频");
                                } else {
                                    String string = jSONObject2.getString("videoId");
                                    if (!TextUtils.isEmpty(string)) {
                                        JSONObject jSONObject3 = next.h.getJSONObject("feature");
                                        if (jSONObject3 == null) {
                                            if (cw6.b()) {
                                                txj.e(txj.TAG_RENDER, "NewDetailOnLoadHandler feature 为空，无需加载视频");
                                            }
                                        } else if (!"true".equals(jSONObject3.getString("enablePreloadMainPic"))) {
                                            if (cw6.b()) {
                                                txj.e(txj.TAG_RENDER, "NewDetailOnLoadHandler enablePreloadMainPic 关闭，无需加载视频");
                                            }
                                        } else if (((LinkedList) this.f16075a).contains(string)) {
                                            txj.e(txj.TAG_RENDER, "NewDetailOnLoadHandler videoId '" + string + "' 已存在，无需加载视频。");
                                        } else {
                                            if (((LinkedList) this.f16075a).size() >= 30) {
                                                txj.e(txj.TAG_RENDER, "NewDetailOnLoadHandler 队列已满，移除最早的 URL：" + ((String) ((LinkedList) this.f16075a).poll()));
                                            }
                                            ((LinkedList) this.f16075a).offer(string);
                                            e95.a(y9a.b(), string, hsm.a(), ((int) url.a(jSONObject2.getString("videoPreloadSize"), 512L)) * 1000, new hsm.b(string));
                                            txj.e(txj.TAG_RENDER, "NewDetailOnLoadHandler 开始加载视频：" + string);
                                        }
                                    } else if (cw6.b()) {
                                        txj.e(txj.TAG_RENDER, "NewDetailOnLoadHandler videoId为空，无需加载视频");
                                    }
                                }
                            }
                        } else if (cw6.b()) {
                            txj.e(txj.TAG_RENDER, "NewDetailOnLoadHandler mainPicNative为空，无需加载图片");
                        }
                    } else if (cw6.b()) {
                        txj.e(txj.TAG_RENDER, "NewDetailOnLoadHandler item.cacheData 为空，无需加载图片");
                    }
                } else if (cw6.b()) {
                    txj.e(txj.TAG_RENDER, "NewDetailOnLoadHandler item 为空，无需加载图片");
                }
            }
        } catch (Throwable th) {
            txj.f("new_detail异常", "NewDetailOnLoadHandler异常", th);
        }
    }
}
