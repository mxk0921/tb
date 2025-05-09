package com.taobao.mediaplay.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<MediaConfigInfo> mediaConfigInfoList;
    public final int TYPE_SVC = 1;
    public final int TYPE_AUDIO = 2;
    public final int TYPE_P2P = 3;

    static {
        t2o.a(774897772);
    }

    private boolean enableType(String str, int i) {
        Config config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdefe299", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        ArrayList<MediaConfigInfo> arrayList = this.mediaConfigInfoList;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<MediaConfigInfo> it = this.mediaConfigInfoList.iterator();
            while (it.hasNext()) {
                MediaConfigInfo next = it.next();
                if (next != null && next.config != null && !TextUtils.isEmpty(str) && str.toLowerCase().equalsIgnoreCase(next.biz)) {
                    if (i == 1) {
                        return next.config.svc;
                    }
                    if (i == 2) {
                        return next.config.audio;
                    }
                    if (i == 3) {
                        return next.config.p2p;
                    }
                }
            }
            Iterator<MediaConfigInfo> it2 = this.mediaConfigInfoList.iterator();
            while (it2.hasNext()) {
                MediaConfigInfo next2 = it2.next();
                if (!(next2 == null || !"allbiz".equalsIgnoreCase(next2.biz) || (config = next2.config) == null)) {
                    if (i == 1) {
                        return config.svc;
                    }
                    if (i == 2) {
                        return config.audio;
                    }
                    if (i == 3) {
                        return config.p2p;
                    }
                }
            }
        }
        return false;
    }

    public boolean enableOnlyVideo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8762f81", new Object[]{this, str})).booleanValue();
        }
        return enableType(str, 2);
    }

    public boolean enableP2P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8051aa0", new Object[]{this, str})).booleanValue();
        }
        return enableType(str, 3);
    }

    public boolean enableSVC(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("104950b2", new Object[]{this, str})).booleanValue();
        }
        return enableType(str, 1);
    }

    public int getplayBuffer(String str) {
        Config config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1545f6e", new Object[]{this, str})).intValue();
        }
        ArrayList<MediaConfigInfo> arrayList = this.mediaConfigInfoList;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        Iterator<MediaConfigInfo> it = this.mediaConfigInfoList.iterator();
        while (it.hasNext()) {
            MediaConfigInfo next = it.next();
            if (next != null && next.config != null && !TextUtils.isEmpty(str) && str.toLowerCase().equalsIgnoreCase(next.biz)) {
                return next.config.playerBuffer;
            }
        }
        Iterator<MediaConfigInfo> it2 = this.mediaConfigInfoList.iterator();
        while (it2.hasNext()) {
            MediaConfigInfo next2 = it2.next();
            if (next2 != null && "allbiz".equalsIgnoreCase(next2.biz) && (config = next2.config) != null) {
                return config.playerBuffer;
            }
        }
        return -1;
    }
}
