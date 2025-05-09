package tb;

import android.os.Build;
import com.ali.alihadeviceevaluator.old.HardWareInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27594a;
    public float b;
    public float c;

    public int a(HardWareInfo hardWareInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258fbc5", new Object[]{this, hardWareInfo})).intValue();
        }
        if (hardWareInfo == null) {
            return 0;
        }
        String str = hardWareInfo.g;
        this.f27594a = str;
        this.b = hardWareInfo.d;
        this.c = hardWareInfo.e;
        if (str != null) {
            if (str.contains("Adreno")) {
                if (this.f27594a.contains("540") || this.f27594a.contains("530") || this.f27594a.contains("53") || this.f27594a.startsWith("Adreno (TM) 5") || this.f27594a.startsWith("Adreno (TM) 6")) {
                    if (this.b <= 2.0f && this.c <= 1.5f) {
                        return 9;
                    }
                } else if (!this.f27594a.startsWith("Adreno 5") && !this.f27594a.startsWith("Adreno 6")) {
                    if (!this.f27594a.contains("430")) {
                        if (!this.f27594a.contains("420") && !this.f27594a.contains("418")) {
                            if (!this.f27594a.contains("510") && !this.f27594a.contains("506") && !this.f27594a.contains("505")) {
                                if (!this.f27594a.contains("330")) {
                                    if (!this.f27594a.contains("405") && !this.f27594a.contains("320")) {
                                        if (!this.f27594a.contains("225") && !this.f27594a.contains("305") && !this.f27594a.contains("306") && !this.f27594a.contains("308")) {
                                            if (!this.f27594a.contains("220")) {
                                                if (!this.f27594a.contains("205") && !this.f27594a.contains("203")) {
                                                    if (this.f27594a.contains("200")) {
                                                        return 1;
                                                    }
                                                    if (!this.f27594a.startsWith("Adreno 4")) {
                                                        if (this.f27594a.startsWith("Adreno 3")) {
                                                        }
                                                    }
                                                }
                                                return 2;
                                            }
                                            return 3;
                                        }
                                        return 4;
                                    }
                                    return 5;
                                } else if (this.b <= 2.3f) {
                                    return 5;
                                }
                            }
                            return 6;
                        }
                        return 7;
                    }
                    return 8;
                }
                return 10;
            } else if (this.f27594a.contains("Mali")) {
                Build.HARDWARE.toLowerCase();
                if (!this.f27594a.contains("G71") && !this.f27594a.contains("G72")) {
                    if (!this.f27594a.contains("T880 MP") && !this.f27594a.contains("T880")) {
                        if (!this.f27594a.contains("T860")) {
                            if (!this.f27594a.contains("T830") && !this.f27594a.contains("T820")) {
                                if (!this.f27594a.contains("400 MP")) {
                                    if (!this.f27594a.contains("400") && !this.f27594a.contains("450")) {
                                        if (!this.f27594a.contains("T624") && !this.f27594a.contains("T678")) {
                                            if (!this.f27594a.contains("T628")) {
                                                if (!this.f27594a.contains("T604")) {
                                                    if (!this.f27594a.contains("T760") && !this.f27594a.contains("T720")) {
                                                    }
                                                }
                                                return 3;
                                            }
                                        }
                                        return 5;
                                    }
                                    return 2;
                                }
                                return 6;
                            }
                            return 7;
                        }
                        return 8;
                    }
                    return 9;
                }
                return 10;
            } else if (!this.f27594a.contains("PowerVR")) {
                if (this.f27594a.contains("NVIDIA")) {
                    float f = this.b;
                    if (f < 1.8f) {
                        if (f < 2.2f) {
                            if (f < 2.0f) {
                                if (f >= 1.8f) {
                                    return 4;
                                }
                                return 3;
                            }
                            return 5;
                        }
                        return 6;
                    }
                } else if (this.f27594a.contains("Android Emulator")) {
                }
                return 8;
            } else if (this.f27594a.contains("SGX 530")) {
                return 1;
            } else {
                if (!this.f27594a.contains("SGX 535") && !this.f27594a.contains("SGX 531")) {
                    if (!this.f27594a.contains("SGX 544") && !this.f27594a.contains("SGX 543")) {
                        if (!this.f27594a.contains("G6200") && !this.f27594a.contains("6200") && !this.f27594a.contains("G6400") && !this.f27594a.contains("G6430") && !this.f27594a.contains("G6") && !this.f27594a.contains("6")) {
                            if (this.f27594a.contains("6450") || this.f27594a.contains("7")) {
                                return 6;
                            }
                        }
                        return 5;
                    }
                    return 3;
                }
                return 2;
            }
        }
        return 0;
    }
}
