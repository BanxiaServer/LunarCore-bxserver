local function beta_text(obj)
    local gameObject = CS.UnityEngine.GameObject.Find("UIRoot/AboveDialog/BetaHintDialog(Clone)")

    if gameObject then
        local textComponent = gameObject:GetComponentInChildren(typeof(CS.RPG.Client.LocalizedText))

        if textComponent then
--            textComponent.text = "亡灵暴龙大帝" 
            uid = textComponent.text;
            uid = uid:gsub("UID:", "<color=#ff99ff>半</color><color=#e899ff>夏</color><color=#d999ff>公</color><color=#c999ff>益</color><color=#ba99ff>服</color><color=#ab99ff>:</color>")
            uid = uid:gsub("CNBETAWin2.0.54_D6648440_A6635239_L6635795", "")
            uid = uid:gsub(" ", "")
            uid = uid:gsub("当前版本为测试版本，不代表游戏最终品质", "只要心中有方向,你就一定能抵达故事的结局 欢迎来到半夏公益服 Q群154422757")
            uid = uid:gsub("BETA", "CECREAEATION")
            uid = uid:gsub("GM", "CECREAEATION")
            textComponent.text = "<color=#00E6CF>"..uid.."</color>"
        else
            log:write("No Text component found on the game object") 
        end
    else
         log:write("Game object not found")
    end
end

local function version_text(obj)
    local gameObject = CS.UnityEngine.GameObject.Find("VersionText")

    if gameObject then
        local textComponent = gameObject:GetComponentInChildren(typeof(CS.RPG.Client.LocalizedText))

        if textComponent then
            uid = textComponent.text;
            uid = uid:gsub("UID:", "<color=#ff99ff>半</color><color=#e899ff>夏</color><color=#d999ff>公</color><color=#c999ff>益</color><color=#ba99ff>服</color><color=#ab99ff>:</color>")
            uid = uid:gsub("BETA", "CECREAEATION")
            uid = uid:gsub("GM", "CECREAEATION") 

            textComponent.text = "<color=#FE969A>"..uid.."</color>"
            -- uidobj.text = "<color=#FE969A>"..uid.."</color>"
        else
            log:write("No Text component found on the game object")
        end
    else
         log:write("Game object not found")
    end
end

local function mhy_text(obj)
    local gameObject = CS.UnityEngine.GameObject.Find("MHYText")

    if gameObject then
        local textComponent = gameObject:GetComponentInChildren(typeof(CS.RPG.Client.LocalizedText))

        if textComponent then
            textComponent.text = "半夏公益服"
            textComponent.visible = true
        else
            -- log:write("No Text component found on the game object")
        end
    else
        -- log:write("Game object not found")
    end
end
version_text()
beta_text()
mhy_text()
