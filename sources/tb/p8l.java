package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.orange.OConstant;
import com.taobao.orange.sync.IndexUpdateHandler;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class p8l {

    /* renamed from: a  reason: collision with root package name */
    public final String f25942a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    static {
        t2o.a(525337358);
    }

    public p8l() {
        this.f25942a = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
    }

    public p8l(Map<String, ? extends Object> map) {
        this();
        if (MegaUtils.x(map, "appVersion", null) != null) {
            String x = MegaUtils.x(map, OConstant.DIMEN_CONFIG_CHANGE_VERSION, null);
            if (x != null) {
                this.f25942a = x;
                Integer m = MegaUtils.m(map, "highLazy", null);
                if (m != null) {
                    this.b = m.intValue();
                    String x2 = MegaUtils.x(map, "loadLevel", null);
                    if (x2 != null) {
                        this.c = x2;
                        String x3 = MegaUtils.x(map, "md5", null);
                        if (x3 != null) {
                            this.d = x3;
                            String x4 = MegaUtils.x(map, "name", null);
                            if (x4 != null) {
                                this.e = x4;
                                String x5 = MegaUtils.x(map, IndexUpdateHandler.IndexUpdateInfo.SYNC_KEY_RESOURCEID, null);
                                if (x5 != null) {
                                    this.f = x5;
                                    String x6 = MegaUtils.x(map, "type", null);
                                    if (x6 != null) {
                                        this.g = x6;
                                        String x7 = MegaUtils.x(map, "version", null);
                                        if (x7 != null) {
                                            this.h = x7;
                                            return;
                                        }
                                        throw new RuntimeException("version 参数必传！");
                                    }
                                    throw new RuntimeException("type 参数必传！");
                                }
                                throw new RuntimeException("resourceId 参数必传！");
                            }
                            throw new RuntimeException("name 参数必传！");
                        }
                        throw new RuntimeException("md5 参数必传！");
                    }
                    throw new RuntimeException("loadLevel 参数必传！");
                }
                throw new RuntimeException("highLazy 参数必传！");
            }
            throw new RuntimeException("changeVersion 参数必传！");
        }
        throw new RuntimeException("appVersion 参数必传！");
    }
}
