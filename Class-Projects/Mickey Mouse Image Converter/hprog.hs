import System.Environment


--haskell program to subtract each element of a list by 255 in this case for the image part of the label
--originally it was subtract by 1 for the day 1 part of the lab
subtractBy1 :: [Int] -> [Int]
subtractBy1 [] = []
subtractBy1 (x:xs) = (255-x) : subtractBy1 xs


main :: IO()
main = do 
    args <- getArgs
    let numbers = map read args :: [Int]
    let result = subtractBy1 numbers
    let resultStrings = map show result
    let outputString = unwords resultStrings
    putStrLn outputString