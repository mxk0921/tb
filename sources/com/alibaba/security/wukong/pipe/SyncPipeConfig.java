package com.alibaba.security.wukong.pipe;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SyncPipeConfig implements Serializable {
    public int bizId;
    public ArrayList<String> crc32Hashs;
    public String defaultRiskData;
    public String notHitRiskData;
}
