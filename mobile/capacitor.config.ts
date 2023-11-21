import { CapacitorConfig } from "@capacitor/cli";

const config: CapacitorConfig = {
  appId: "proj.tp.nba",
  appName: "nba team stat",
  webDir: "dist",
  server: {
    androidScheme: "https",
  },
};

export default config;
