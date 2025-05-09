package com.alibaba.security.wukong.config;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RiskSceneInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<Algo> algoList;
    public boolean isPlugin;
    public String sceneName;

    public int algoSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8447976e", new Object[]{this})).intValue();
        }
        List<Algo> list = this.algoList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public boolean contains(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue();
        }
        List<Algo> list = this.algoList;
        if (list != null) {
            for (Algo algo : list) {
                if (TextUtils.equals(str, algo.code)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int needInferSize() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9845ad73", new Object[]{this})).intValue();
        }
        List<Algo> list = this.algoList;
        if (list != null) {
            for (Algo algo : list) {
                if (!algo.preRun) {
                    i++;
                }
            }
        }
        return i;
    }
}
